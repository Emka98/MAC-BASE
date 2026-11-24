-- Dane testowe dla schematu: users, company, company_oui, device_types, device, mac_address
-- Wymaga PostgreSQL 11+ (funkcja sha256). Uruchamiaj na pustych tabelach.

-- Opcjonalne czyszczenie (odkomentuj, jeśli chcesz zacząć od zera):
-- TRUNCATE mac_address, device, device_types, company_oui, company, users RESTART IDENTITY CASCADE;

-- ---------------------------------------------------------------
-- users (hasła: sha256 w hex = 64 znaki; TYLKO do testów)
-- ---------------------------------------------------------------
INSERT INTO users (name, password, role) VALUES
('admin',   encode(sha256('admin123'::bytea),  'hex'), 'ROLE_ADMIN')
                                              , ('jkowalski', encode(sha256('user123'::bytea),   'hex'), 'ROLE_USER')
                                              , ('anowak',    encode(sha256('user456'::bytea),   'hex'), 'ROLE_USER')
                                              , ('viewer',    encode(sha256('viewer123'::bytea), 'hex'), 'ROLE_VIEWER');

-- ---------------------------------------------------------------
-- company
-- ---------------------------------------------------------------
INSERT INTO company (name) VALUES
('Cisco Systems, Inc.')
                                , ('TP-Link Technologies Co., Ltd.')
                                , ('Ubiquiti Inc.')
                                , ('MikroTikls SIA')
                                , ('Dell Inc.')
                                , ('Hewlett Packard Enterprise');

-- ---------------------------------------------------------------
-- company_oui (ostatnie 3 bajty muszą być zerowe - CHECK)
-- ---------------------------------------------------------------
INSERT INTO company_oui (oui, company_id)
SELECT v.oui::macaddr, c.company_id
FROM (VALUES
      ('00:00:0c:00:00:00', 'Cisco Systems, Inc.')
           , ('00:1b:54:00:00:00', 'Cisco Systems, Inc.')
           , ('50:c7:bf:00:00:00', 'TP-Link Technologies Co., Ltd.')
           , ('98:da:c4:00:00:00', 'TP-Link Technologies Co., Ltd.')
           , ('24:5a:4c:00:00:00', 'Ubiquiti Inc.')
           , ('78:8a:20:00:00:00', 'Ubiquiti Inc.')
           , ('4c:5e:0c:00:00:00', 'MikroTikls SIA')
           , ('00:06:5b:00:00:00', 'Dell Inc.')
           , ('00:1e:c9:00:00:00', 'Dell Inc.')
           , ('00:01:e6:00:00:00', 'Hewlett Packard Enterprise')
     ) AS v(oui, company_name)
         JOIN company c ON c.name = v.company_name;

-- ---------------------------------------------------------------
-- device_types
-- ---------------------------------------------------------------
INSERT INTO device_types (name, description, producer)
SELECT v.name, v.description, c.company_id
FROM (VALUES
      ('Catalyst 9200',   'Przełącznik zarządzalny L3, 24 porty',        'Cisco Systems, Inc.')
           , ('ISR 4331',        'Router brzegowy',                             'Cisco Systems, Inc.')
           , ('Archer AX55',     'Router Wi-Fi 6 AX3000',                       'TP-Link Technologies Co., Ltd.')
           , ('TL-SG108',        'Przełącznik niezarządzalny 8-portowy',        'TP-Link Technologies Co., Ltd.')
           , ('UniFi U6 Pro',    'Punkt dostępowy Wi-Fi 6',                     'Ubiquiti Inc.')
           , ('UniFi Dream Machine', 'Router/kontroler UniFi all-in-one',       'Ubiquiti Inc.')
           , ('hAP ax3',         'Router Wi-Fi 6 RouterOS',                     'MikroTikls SIA')
           , ('Latitude 5540',   'Laptop biznesowy 15.6"',                      'Dell Inc.')
     ) AS v(name, description, producer_name)
         JOIN company c ON c.name = v.producer_name;

-- ---------------------------------------------------------------
-- device: 5 urządzeń na każdy typ (razem 40)
-- ---------------------------------------------------------------
INSERT INTO device (serial_number, type)
SELECT t.device_types_id * 100000 + n * 37, t.device_types_id
FROM device_types t
         CROSS JOIN generate_series(1, 5) AS n;

-- ---------------------------------------------------------------
-- mac_address
--   * każde urządzenie ma 1 MAC (np. Ethernet)
--   * parzyste device_id mają drugi MAC (np. Wi-Fi)
--   * co czwarty drugi MAC jest oznaczony jako returned = true
--   * prefiks MAC-a = pierwszy OUI producenta, więc dane są spójne
-- ---------------------------------------------------------------
INSERT INTO mac_address (mac_address, returned, device)
SELECT
    (substr(o.oui::text, 1, 8) || ':' || substr(x.h, 1, 2) || ':' || substr(x.h, 3, 2) || ':' || substr(x.h, 5, 2))::macaddr
     , (i = 2 AND d.device_id % 4 = 0)
     , d.device_id
FROM device d
         JOIN device_types t ON t.device_types_id = d.type
         JOIN LATERAL (
    SELECT oui
    FROM company_oui
    WHERE company_id = t.producer
    ORDER BY company_oui_id
    LIMIT 1
    ) o ON true
         CROSS JOIN generate_series(1, 2) AS i
         CROSS JOIN LATERAL (SELECT lpad(to_hex(d.device_id * 10 + i), 6, '0') AS h) x
WHERE i = 1 OR d.device_id % 2 = 0;

