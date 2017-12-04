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

create table admin_entity_user_permission (
  admin_entity_admin_id         varchar(255) not null,
  user_permission_id            bigint not null,
  constraint pk_admin_entity_user_permission primary key (admin_entity_admin_id,user_permission_id)
);

create table user_permission (
  id                            bigint auto_increment not null,
  permission_value              varchar(255),
  constraint pk_user_permission primary key (id)
);

alter table admin_entity_user_permission add constraint fk_admin_entity_user_permission_admin_entity foreign key (admin_entity_admin_id) references admin_entity (admin_id) on delete restrict on update restrict;
create index ix_admin_entity_user_permission_admin_entity on admin_entity_user_permission (admin_entity_admin_id);

alter table admin_entity_user_permission add constraint fk_admin_entity_user_permission_user_permission foreign key (user_permission_id) references user_permission (id) on delete restrict on update restrict;
create index ix_admin_entity_user_permission_user_permission on admin_entity_user_permission (user_permission_id);


# --- !Downs

alter table admin_entity_user_permission drop foreign key fk_admin_entity_user_permission_admin_entity;
drop index ix_admin_entity_user_permission_admin_entity on admin_entity_user_permission;

alter table admin_entity_user_permission drop foreign key fk_admin_entity_user_permission_user_permission;
drop index ix_admin_entity_user_permission_user_permission on admin_entity_user_permission;

drop table if exists admin_entity;

drop table if exists admin_entity_user_permission;

drop table if exists user_permission;

