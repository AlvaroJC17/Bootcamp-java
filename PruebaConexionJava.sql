create database ConexionJava;
use ConexionJava;
show tables;
drop table Profesor;
drop table alumno;

create table alumno(
id_alumno int auto_increment not null,
dni_alumno int(10),
nombre varchar(30),
apellido varchar(30),
email varchar(30),
curso varchar(30),
calificacion int,
primary key(id_alumno),
unique(dni_alumno) 
);

create table profesor (
id_profesor int auto_increment not null,
dni_profesor int(10),
nombre varchar(30),
apellido varchar(30),
email varchar(30),
curso varchar(30),
sueldo int,
primary key(id_profesor),
unique(dni_profesor) 
);



insert into profesor (dni_profesor, nombre, apellido, email, curso, sueldo) values(95822499,"Alvaro", "Cortesia", "alvarocortesia@gmail.com", "JAVA", 20000);
insert into alumno (dni_alumno, nombre, apellido, email, curso, calificacion) values (12345678, "prueba", "prueba", "knjfnjdfj@fdf.com", "mat", 5);

select * from profesor;
select * from alumno;

DELETE FROM profesor
WHERE dni_profesor = '12345678';

DELETE FROM alumno
WHERE dni_alumno = '12345678';

UPDATE profesor SET dni_profesor = 1, nombre = "juan" where id_profesor = 4;