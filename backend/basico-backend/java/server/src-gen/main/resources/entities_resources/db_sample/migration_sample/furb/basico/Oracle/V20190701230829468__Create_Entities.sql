/* Database: Oracle. Generation date: 2019-07-01 23:08:29:468 */
/* Entity Fregues */
create table fregues (
	id RAW(16) NOT NULL,
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
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	email VARCHAR(255) NOT NULL,
	cpf VARCHAR(255) NOT NULL,
	endereco VARCHAR(255) NOT NULL,
	nome_usuario VARCHAR(255) NOT NULL /* nomeUsuario */,
	senha VARCHAR(255) NOT NULL,
	tipo VARCHAR(255) NOT NULL,
	salario NUMBER(19,4) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Servico */
create table servico (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	valor NUMBER(19,4) NOT NULL
);



/* Entity Atendimento */
create table atendimento (
	id RAW(16) NOT NULL,
	fregues RAW(16) NOT NULL,
	funcionario RAW(16) NOT NULL,
	data_atendimento DATE NOT NULL /* dataAtendimento */,
	valor_total NUMBER(19,4) NOT NULL /* valorTotal */
);



/* Join Tables */
/* master: Atendimento as atendimento, detail: Servico as servico */
create table atendimento_servicos (
	atendimento_id RAW(16) NOT NULL,
	servicos_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table fregues add constraint pk_fregues_id primary key(id);
alter table funcionario add constraint pk_funcionario_id primary key(id);
alter table servico add constraint pk_servico_id primary key(id);
alter table atendimento_servicos add constraint pk_atendimento_servicos primary key(atendimento_id, servicos_id);
alter table atendimento add constraint pk_atendimento_id primary key(id);

/* Foreign Key Constraints */
alter table atendimento add constraint fkk3sxak6pnxjcwlrfnslaq28cjkkg foreign key (fregues) references fregues (id);
alter table atendimento add constraint fkgmuqjfmsqrkod3vejcvokb9lsq6g foreign key (funcionario) references funcionario (id);
alter table atendimento_servicos add constraint fkitdxtffbayzdt2ecx7a2ksijjud2 foreign key (atendimento_id) references atendimento (id);
alter table atendimento_servicos add constraint fkxtwy2pbzqfczsiugznvmnwrzwqke foreign key (servicos_id) references servico (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
