CREATE DATABASE ProyectoLaboratorio;
USE ProyectoLaboratorio;

CREATE TABLE laboratorio (id INT PRIMARY KEY auto_increment,nombre VARCHAR(30),especialidad VARCHAR(15),direccion VARCHAR(20),telefono INT,correo_Electronico VARCHAR(20));
CREATE TABLE cientificos (id INT PRIMARY KEY auto_increment,nombre VARCHAR(30),apellidos VARCHAR(30),fecha_nacimiento DATE,telefono INT);
CREATE TABLE trabajan (id_laboratorio INT,id_cientifico INT, PRIMARY KEY (id_laboratorio, id_cientifico), FOREIGN KEY (id_laboratorio) REFERENCES laboratorio(id), FOREIGN KEY (id_cientifico) REFERENCES cientificos(id));

CREATE TABLE clinicas (id INT PRIMARY KEY auto_increment, nombre VARCHAR(30));
CREATE TABLE compuesto (id_clinicas INT, id_laboratorio INT, PRIMARY KEY (id_clinicas,id_laboratorio), FOREIGN KEY (id_clinicas) REFERENCES clinicas(id), FOREIGN KEY (id_laboratorio) REFERENCES laboratorio(id));
CREATE TABLE experimento (id INT PRIMARY KEY auto_increment,nombre VARCHAR(30),descripcion VARCHAR(30),fecha_inicio DATE,fecha_finalizacion DATE,cientifico_responsable VARCHAR(30));

CREATE TABLE realizan (id_clinicas INT, id_experimentos INT, PRIMARY KEY (id_clinicas,id_experimentos), FOREIGN KEY (id_clinicas) REFERENCES clinicas(id), FOREIGN KEY (id_experimentos) REFERENCES experimento (id));




-- Insertar datos en la tabla laboratorio
INSERT INTO laboratorio (nombre, especialidad, direccion, telefono, correo_Electronico)
VALUES ('Lab 5', 'Química', '654 Main St', 888999000, 'lab5@email.com');

-- Insertar datos en la tabla cientificos
INSERT INTO cientificos (nombre, apellidos, fecha_nacimiento, telefono)
VALUES ('Ana', 'García', '1970-01-01', 333444555);

-- Insertar datos en la tabla trabajan
INSERT INTO trabajan (id_laboratorio, id_cientifico)
VALUES (3, 5);

-- Insertar datos en la tabla clinicas
INSERT INTO clinicas (nombre)
VALUES ('Clínica 5');

-- Insertar datos en la tabla compuesto
INSERT INTO compuesto (id_clinicas, id_laboratorio)
VALUES (5, 5);

-- Insertar datos en la tabla experimento
INSERT INTO experimento (nombre, descripcion, fecha_inicio, fecha_finalizacion, cientifico_responsable)
VALUES ('Experimento 5', 'Experimento de prueba', '2026-01-01', '2026-12-31', 'Ana García');

-- Insertar datos en la tabla realizan
INSERT INTO realizan (id_clinicas, id_experimentos)
VALUES (4, 4);