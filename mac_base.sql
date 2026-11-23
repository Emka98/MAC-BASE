CREATE TYPE role as ENUM (
    'ROLE_USER',
    'ROLE_ADMIN',
    'ROLE_VIEWER'
    );

CREATE TABLE users (
      user_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    , name VARCHAR(32) NOT NULL UNIQUE
    -- I will use sha256
    , password VARCHAR(64) NOT NULL
    , role role NOT NULL
);

CREATE TABLE company (
      company_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    -- KRS limit is 2,000, but in practice 200 max
    , name VARCHAR(200) NOT NULL
);

CREATE TABLE company_oui (
       company_oui_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
     , oui macaddr
     , company_id INTEGER NOT NULL REFERENCES company (company_id)
     , CHECK (oui = trunc(oui))
);

CREATE TABLE device_types (
      device_types_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    , name VARCHAR(64) NOT NULL UNIQUE
    , description VARCHAR(255)
    , producer INTEGER NOT NULL REFERENCES company(company_id)
);

CREATE TABLE device (
      device_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    , serial_number INTEGER
    , type INTEGER NOT NULL REFERENCES device_types(device_types_id)
);

CREATE TABLE mac_address (
      mac_address_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    --first idea it was use mac_address like primary key
    , mac_address macaddr not null
    , returned boolean not null default false
    , device INTEGER NOT NULL REFERENCES device(device_id) ON DELETE CASCADE
    , CONSTRAINT mac_device UNIQUE (device, mac_address)
);



