create table ad_user
(
    ad_user_uid     varchar(40)  not null
        primary key,
    isactif         boolean      not null,
    created         timestamp    not null,
    updated         timestamp    not null,
    email           varchar(255) not null
        unique,
    password        varchar(512) not null,
    password_backup varchar(255) default NULL:: character varying,
    first_name      varchar(60),
    last_name       varchar(60),
    gender          varchar(1)
        constraint sys_gender
            check (gender = ANY (ARRAY['M'::bpchar, 'F'::bpchar])),
    birthday        timestamp,
    address         varchar(255),
    ad_role_id      integer      not null
        constraint fk_user_role
            references ad_role
);