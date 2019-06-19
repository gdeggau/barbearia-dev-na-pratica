/* Database: SqlServer. Generation date: 2019-06-18 21:42:54:579 */
/* Entity Fregues */
create table fregues (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	email VARCHAR(255) NOT NULL,
	cpf VARCHAR(255),
	telefone VARCHAR(255),
	endereco VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Funcionario */
create table funcionario (
	id UNIQUEIDENTIFIER NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	email VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	endereco VARCHAR(255) NOT NULL,
	nome_usuario VARCHAR(255) NOT NULL /* nomeUsuario */,
	senha VARCHAR(255) NOT NULL,
	tipo VARCHAR(255) NOT NULL,
	salario FLOAT(32) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Servico */
create table servico (
	id UNIQUEIDENTIFIER NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor FLOAT(32) NOT NULL
);



/* Entity Atendimento */
create table atendimento (
	id UNIQUEIDENTIFIER NOT NULL,
	fregues UNIQUEIDENTIFIER NOT NULL,
	funcionario UNIQUEIDENTIFIER NOT NULL,
	data_atendimento DATE NOT NULL /* dataAtendimento */,
	valor_total FLOAT(32) NOT NULL /* valorTotal */
);



/* Join Tables */
/* master: Atendimento as atendimento, detail: Servico as servico */
create table atendimento_servicos (
	atendimento_id UNIQUEIDENTIFIER NOT NULL,
	servicos_id UNIQUEIDENTIFIER NOT NULL
);

/* Primary Key Constraints */
alter table fregues add constraint pk_fregues_id primary key(id);
alter table funcionario add constraint pk_funcionario_id primary key(id);
alter table servico add constraint pk_servico_id primary key(id);
alter table atendimento_servicos add constraint pk_atendimento_servicos primary key(atendimento_id, servicos_id);
alter table atendimento add constraint pk_atendimento_id primary key(id);

/* Foreign Key Constraints */
alter table atendimento add constraint fkun59wjhflxozi2tiz49wj38dfyhb foreign key (fregues) references fregues (id);
alter table atendimento add constraint fkdaxavjrcjhgurblway1pnkokztlr foreign key (funcionario) references funcionario (id);
alter table atendimento_servicos add constraint fkgnoalcmhua5quozuqgmaji0aoopf foreign key (atendimento_id) references atendimento (id);
alter table atendimento_servicos add constraint fkrdgeqt3h33fs1pd3rszsw5047fh4 foreign key (servicos_id) references servico (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
