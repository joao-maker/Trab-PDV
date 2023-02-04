
create table Produto(

	id int(5) auto_increment,
    nome varchar(45) not null,
    marca varchar(45) not null,
    categoria varchar(45) not null,
    descricao varchar(255),
    vl_custo double not null,
    vl_venda double not null,
    estoque int not null,
    primary key(id)
    
);



create table Cliente (

	id int(5) auto_increment,
    nome varchar(90) not null,
    tipo_pessoa varchar(2) not null,
    cpf varchar(45),
    cnpj varchar(45),
    email varchar(45) not null,
    fone_1 varchar(45) not null,
    fone_2 varchar(45),
    fone_3 varchar(45),
    rua varchar(90) not null,
    numero int(5) not null,
    bairro varchar(90) not null,
    primary key(id)
);

create table Funcionario(
	
    id int(5) auto_increment,
    nome varchar(90) not null,
    num_carteira varchar(45) not null,
    funcao varchar (45) not null,
    fone varchar(45) not null,
    email varchar(90) not null,
    senha int(8) not null,
    primary key(id)
);
create table usuario(
	id_usuario int(5) unique,
    email varchar(90) ,
    senha int(8),
    foreign key (id_usuario) references funcionario(id)
    on delete cascade
);




insert  into  usuario select distinct  id,  email,  senha from funcionario where id on DUPLICATE key update id_usuario = id, usuario.email = funcionario.email, usuario.senha = funcionario.senha;

