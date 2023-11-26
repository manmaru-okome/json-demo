create table part_number (
	part_id integer,
	part_code varchar(20),
	part_name varchar(20),
	primary key (part_id)
);

create table part_structure (
	structure_id integer,
	parent_pard_id integer,
	child_part_id integer,
	number_of_members integer,
	primary key (structure_id)
);


insert into part_number (part_id, part_code, part_name)
values (1, 'parent', 'parent1'), (2,'child', 'child');

insert into part_structure (structure_id, parent_pard_id, child_part_id, number_of_members)
values (1, 1, 2, 1);
