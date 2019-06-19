/* Database: Oracle. Generation date: 2019-05-28 14:12:01:819 */
/* Entity Cliente */
create table cliente (
	id RAW(16) NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado NUMBER(1) /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */
);



/* Entity Item */
create table item (
	id RAW(16) NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMBER(19,4) NOT NULL,
	valor_unitario NUMBER(19,4) NOT NULL /* valorUnitario */
);



/* Entity Pedido */
create table pedido (
	id RAW(16) NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente RAW(16) NOT NULL
);



/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id RAW(16) NOT NULL,
	itens_id RAW(16) NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fk2ud7zc5bucb0t559zhxnzxj9o1zl foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fk4qp5ybu3juyaupqgittosgz3tv1s foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkbtm6f1eg8d4p1eg6vidfrjx6qb7d foreign key (itens_id) references item (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
