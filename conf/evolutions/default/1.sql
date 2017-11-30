# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin_entity (
  admin_id                      varchar(255) not null,
  admin_type                    varchar(255),
  company_name                  varchar(255),
  name                          varchar(255),
  email                         varchar(255),
  active_status                 varchar(255),
  branch                        varchar(255),
  username                      varchar(255),
  name_kana                     varchar(255),
  constraint pk_admin_entity primary key (admin_id)
);


# --- !Downs

drop table if exists admin_entity;

