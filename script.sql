create database treinarecife_db;

create table treinarecife_db.tb_alunos{
    id bigint auto_increment_primarykey,
    nome varchar(50) not null,
    sobrenome varchar(150) not null,
    email varchar(255) not null,
    data_nascimento date
};

insert into treina_recife_db.tb_alunos 
values (1, "Gustavo", "Almeida Borba", "aa@gmail.com", Null);