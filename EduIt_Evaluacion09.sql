CREATE DATABASE personal;

USE personal;

CREATE TABLE empleados(
clave_empleado VARCHAR(8),
nombre VARCHAR(30),
apellidos VARCHAR(30),
clave_depto INT,
PRIMARY KEY(clave_empleado),
foreign key(clave_depto) REFERENCES departamento(clave_depto)
);

CREATE TABLE departamento(
clave_depto INT,
nombre VARCHAR(30),
presupuesto INT,
PRIMARY KEY(clave_depto)
);

INSERT INTO departamento VALUES
(1, "Personal", 80000),
(2, "Almacén", 70000),
(3, "Contabilidad", 60000),
(4, "Manufactura", 50000),
(5, "Empaque", 30000);

INSERT INTO empleados VALUES 
("EMP01", "Armando", "Lopéz", 2),
("EMP02", "Tatiana", "Vargas", 1),
("EMP03", "Laura", "Iturria", 3),
("EMP04", "Juan", "Peréz", 4),
("EMP05", "Iván", "Lopéz", 4),
("EMP06", "Margarita", "Hernández", 1),
("EMP07", "Jesus", "Peréz", 3),
("EMP08", "Tonatiuh", "Flores", 2),
("EMP09", "Juan", "Lopéz", 4),
("EMP10", "Jóse", "Hernández", 5);

SELECT nombre, apellidos FROM empleados;

SELECT nombre FROM empleados WHERE apellidos = "Pérez";

SELECT nombre FROM empleados WHERE clave_depto = 4;

/*Otra forma de hacerlo*/
SELECT empleados.nombre, departamento.nombre AS nombre_depto, departamento.clave_depto
FROM empleados
INNER JOIN departamento ON empleados.clave_depto = departamento.clave_depto
WHERE departamento.clave_depto = 4;

SELECT * FROM departamento WHERE presupuesto BETWEEN 50000 AND 70000;

