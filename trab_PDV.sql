create database sistema_PDV;

use sistema_PDV;

create table cliente(
	
    id int primary key not null,
    nome varchar(255) not null,
    endereco varchar(255) not null,
    numero_endereco int not null,
    cpf varchar(11) not null,
    fone_1 varchar(11) not null,
    fone_2 varchar(11),
    fone_3 varchar(11),
    email varchar(255) not null,
    tipo_pessoa char(2) not null
);

create table produto(
	
    cod_peca int primary key not null,
    nome varchar(255) not null,
    marca varchar(255) not null,
    descricao varchar(255) not null,
    vl_custo double not null,
    vl_venda double not null

)

CREATE TABLE VENDEDOR(
    ID INT PRIMARY KEY,
    NOME VARCHAR(100)NOT NULL,
    SENHA VARCHAR(200)NOT NULL,
    H_CARTEIRA_TRABALHO VARCHAR(20)NOT NULL,
    TELEFONE VARCHAR(50)NOT NULL,
    EMAIL VARCHAR(100)NOT NULL)
