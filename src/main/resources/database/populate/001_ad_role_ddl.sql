create table ad_role
(
    ad_role_id  serial
        primary key,
    isactif     boolean     not null,
    created     timestamp   not null,
    updated     timestamp   not null,
    name        varchar(50) not null,
    value       varchar(50) not null
        unique,
    description varchar(255)
);