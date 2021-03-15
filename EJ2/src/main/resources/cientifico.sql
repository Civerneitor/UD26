use cientifico;
drop table if exists cientifico_proyecto;
drop table if exists proyectos;
drop table if exists cientificos;
create table cientificos(
DNI varchar(8) primary key,
nom_apels varchar(255) not null
);

create table proyectos(
id char(4) primary key,
nombre varchar(255) not null,
horas int not null
);

create table cientifico_proyecto(
id_cientifico varchar(8),
id_proyecto char(4),
primary key(id_cientifico, id_proyecto),
foreign key (id_cientifico) references cientificos(DNI) on delete no action on update cascade,
foreign key (id_proyecto) references proyectos(id) on delete no action on update cascade
);

insert into cientificos values("1111111A","Juan Lopez");
insert into cientificos values("1111111B","Maria Marinez");
insert into cientificos values("1111111C","Marta Diaz");
insert into cientificos values("1111111D","Toni Arjona");
insert into cientificos values("1111111E","Jose Marin");
insert into cientificos values("1111111F","Juan Ignacio");
insert into cientificos values("1111111G","Pepe Exposito");
insert into cientificos values("1111111H","Juan Perez");
insert into cientificos values("1111111I","Jose Perez");
insert into cientificos values("1111111J","Juan Alarcon");

insert into proyectos values('AAAA', "Aplicaciones A", 6);
insert into proyectos values('AAAB', "Aplicaciones B", 8);
insert into proyectos values('AAAC', "Aplicaciones C", 9);
insert into proyectos values('AAAD', "Aplicaciones D", 12);
insert into proyectos values('AAAE', "Aplicaciones E", 17);
insert into proyectos values('AAAF', "Aplicaciones F", 16);
insert into proyectos values('AAAG', "Aplicaciones G", 40);
insert into proyectos values('AAAH', "Aplicaciones H", 30);
insert into proyectos values('AAAI', "Aplicaciones I", 64);
insert into proyectos values('AAAJ', "Aplicaciones J", 100);

insert into cientifico_proyecto values("1111111A", 'AAAA');
insert into cientifico_proyecto values("1111111B", 'AAAB');
insert into cientifico_proyecto values("1111111C", 'AAAC');
insert into cientifico_proyecto values("1111111D", 'AAAD');
insert into cientifico_proyecto values("1111111E", 'AAAE');
insert into cientifico_proyecto values("1111111F", 'AAAF');
insert into cientifico_proyecto values("1111111G", 'AAAG');
insert into cientifico_proyecto values("1111111H", 'AAAH');
insert into cientifico_proyecto values("1111111I", 'AAAI');
insert into cientifico_proyecto values("1111111J", 'AAAJ');