create table ad_user
(
    ad_user_uid     VARCHAR(40) NOT NULL PRIMARY KEY ,
    isactif         BOOLEAN NOT NULL,
    created         DATE,
    updated         DATE,
    email           VARCHAR(255) NOT NULL UNIQUE,
    password        VARCHAR(512) NOT NULL,
    password_backup VARCHAR(255) DEFAULT NULL,
    first_name      VARCHAR(60),
    last_name       VARCHAR(60),
    gender          CHAR
        constraint sys_gender
            check (gender = ANY (ARRAY ['M'::bpchar, 'F'::bpchar])),
    birthday        DATE,
    address         VARCHAR(255),
    ad_role_id      INT NOT NULL CONSTRAINT fk_user_role REFERENCES ad_role
);