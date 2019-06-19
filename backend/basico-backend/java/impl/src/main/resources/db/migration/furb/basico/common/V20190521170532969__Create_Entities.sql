/* Database: PostgreSql. Generation date: 2019-05-21 17:05:32:969 */
/* Entity Cliente */
create table cliente (
	id UUID NOT NULL,
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BOOLEAN /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	id_foto VARCHAR(255) /* idFoto */,
	ext JSONB
);


/* Creating index for customization column */
create index cliente_ext on cliente using gin (ext);

/* Entity Item */
create table item (
	id UUID NOT NULL,
	descricao VARCHAR(255) NOT NULL,
	quantidade NUMERIC(19,4) NOT NULL,
	valor_unitario NUMERIC(19,4) NOT NULL /* valorUnitario */,
	ext JSONB
);


/* Creating index for customization column */
create index item_ext on item using gin (ext);

/* Entity Pedido */
create table pedido (
	id UUID NOT NULL,
	data DATE NOT NULL,
	obsservacoes VARCHAR(255),
	cliente UUID NOT NULL,
	ext JSONB
);


/* Creating index for customization column */
create index pedido_ext on pedido using gin (ext);

/* Join Tables */
/* master: Pedido as pedido, detail: Item as item */
create table pedido_itens (
	pedido_id UUID NOT NULL,
	itens_id UUID NOT NULL
);

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);
alter table item add constraint pk_item_id primary key(id);
alter table pedido_itens add constraint pk_pedido_itens primary key(pedido_id, itens_id);
alter table pedido add constraint pk_pedido_id primary key(id);

/* Foreign Key Constraints */
alter table pedido add constraint fkpu6md6noxsmrofc67lihqojguomh foreign key (cliente) references cliente (id);
alter table pedido_itens add constraint fkzhczc82gjgjgodgvyblcqufcqe6y foreign key (pedido_id) references pedido (id);
alter table pedido_itens add constraint fkeq7flbcrelniprfufkycpzutydvj foreign key (itens_id) references item (id);

/* Unique Key Constraints */

/* Sequences for auto increment entity ids */
