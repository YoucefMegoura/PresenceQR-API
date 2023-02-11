create table ad_role
(
    ad_role_id  bigserial
        primary key,
    isactif     boolean     DEFAULT true NOT NULL,
    created     timestamp   DEFAULT NOW() NOT NULL,
    updated     timestamp   DEFAULT NOW() NOT NULL,
    name        varchar(50) not null,
    value       varchar(50) not null
        unique,
    description varchar(255)
);