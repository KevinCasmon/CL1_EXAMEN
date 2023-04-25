drop database if exists cl1_examen;
create database bcl1_examen;
use bcl1_examen;
CREATE TABLE areas (
  id_area INT NOT NULL AUTO_INCREMENT,
  nom_area VARCHAR(255) NOT NULL,
  can_cliente_area INT NOT NULL,
  PRIMARY KEY (id_area)
);

CREATE TABLE clientes (
  id_cliente INT NOT NULL AUTO_INCREMENT,
  nom_cliente VARCHAR(255) NOT NULL,
  id_area INT NOT NULL,
  PRIMARY KEY (id_cliente),
  FOREIGN KEY (id_area) REFERENCES areas(id_area)
);

insert into areas values(0,"tecnica",25);
insert into areas values(1,"RRHH",25);
insert into areas values(2,"Administrativo",25);


insert into clientes values(0,"joel",25);
insert into clientes values(0,"alexis",25);
insert into clientes values(0,"kevin",25);
