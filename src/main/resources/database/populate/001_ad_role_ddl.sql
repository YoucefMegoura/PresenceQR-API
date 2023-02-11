create table ad_role (
                           ad_role_id SERIAL NOT NULL PRIMARY KEY,
                           name VARCHAR(50) NOT NULL,
                           value VARCHAR(50) NOT NULL,
                           description VARCHAR(50),
                           isactif BOOLEAN NOT NULL ,
                           created DATE,
                           updated DATE
);

create unique index if not exists ad_role_value
    on ad_role (value);