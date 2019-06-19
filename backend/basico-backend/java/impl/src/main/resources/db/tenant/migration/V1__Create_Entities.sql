/* Entity World */
create table world (
	id UUID NOT NULL,
	name VARCHAR(255) NOT NULL
);

alter table world add constraint pk_world_id primary key(id);
