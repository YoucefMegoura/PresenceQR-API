create table ad_role (
                           ad_role_id SERIAL NOT NULL PRIMARY KEY,
                           name VARCHAR(50) NOT NULL,
                           value VARCHAR(50) NOT NULL UNIQUE,
                           description VARCHAR(255),
                           isactif BOOLEAN NOT NULL ,
                           created DATE,
                           updated DATE
);