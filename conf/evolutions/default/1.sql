# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table pessoa (
  id                            bigserial not null,
  nome                          varchar(255),
  constraint pk_pessoa primary key (id)
);


# --- !Downs

drop table if exists pessoa cascade;

