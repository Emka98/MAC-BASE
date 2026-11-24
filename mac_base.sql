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
     , company_id INTEGER NOT NULL REFERENCES company(company_id)
     , CHECK (oui = trunc(oui))
);

CREATE TABLE device_typ (
      device_typ_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    , name VARCHAR(64) NOT NULL UNIQUE
    , description VARCHAR(255)
    , company_id INTEGER NOT NULL REFERENCES company(company_id)
);

CREATE TABLE device (
      device_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    , serial_number INTEGER
    , device_typ_id INTEGER NOT NULL REFERENCES device_typ(device_typ_id)
);

CREATE TABLE mac_address (
      mac_address_id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY
    --first idea it was use mac_address like primary key
    , mac_address macaddr NOT NULL UNIQUE
    , returned boolean NOT NULL DEFAULT FALSE
    , device_id INTEGER NOT NULL REFERENCES device(device_id)
    , CONSTRAINT mac_device UNIQUE (device_id, mac_address)
);



