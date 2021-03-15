create database tienda;
use tienda;

drop table if exists piezas_proveedor;
drop table if exists piezas;
drop table if exists proveedores;

create table piezas(
id int auto_increment primary key,
nombre varchar(100) not null
);

create table proveedores(
id char(4) primary key,
nombre varchar(100) not null
);

create table piezas_proveedor(
id int auto_increment,
id_proveedor char(4),
id_pieza int,
precio int not null,
primary key (id, id_proveedor, id_pieza),
foreign key(id_proveedor) references proveedores(id) on delete no action on update cascade,
foreign key (id_pieza) references piezas(id) on delete no action on update cascade
);

insert into proveedores values ('ASTU', "Asturiana");
insert into proveedores values ('GATU', "Gatueli");
insert into proveedores values ('REPS', "Respsol");
insert into proveedores values ('MERC', "Mercadona");
insert into proveedores values ('LIDL', "Lidl");
insert into proveedores values ('SPAR', "Spar");
insert into proveedores values ('CARR', "Carrefour");
insert into proveedores values ('TSYS', "T System");
insert into proveedores values ('PILO', "Pilorcian");
insert into proveedores values ('TUTI', "Tutiolo");

insert into piezas(nombre) values ("tuerca");
insert into piezas(nombre) values ("tornillo");
insert into piezas(nombre) values ("arandela");
insert into piezas(nombre) values ("visagra");
insert into piezas(nombre) values ("remache");
insert into piezas(nombre) values ("escuadra");
insert into piezas(nombre) values ("madera");
insert into piezas(nombre) values ("broca");
insert into piezas(nombre) values ("puntas");
insert into piezas(nombre) values ("pintura");

insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('REPS', 1, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('GATU', 2, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ("REPS", 3, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('REPS', 4, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('SPAR', 2, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('GATU', 6, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('SPAR', 8, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('SPAR', 9, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('GATU', 10, 12);
insert into piezas_proveedor(id_proveedor, id_pieza, precio) values ('TUTI', 7, 12);