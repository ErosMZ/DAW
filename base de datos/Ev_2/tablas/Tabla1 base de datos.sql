create database	CARALIBRO;
USE CARALIBRO;
create table usuarios (
	idUsuario int(10) AUTO_INCREMENT primary key unique not null,
    email varchar(45) not null,
    fechaNacimiento date not null,
    nombre varchar(255) not null,
    apellidos varchar(255) not null,
	sexo varchar(1),
    activo boolean not null default 1,
    ciudad varchar(255) not null,
    bloqueado boolean not null default 0,
    numpassword varchar(32) not null,
    IDROL int (10) not null default 1
    
);

/*ALTER TABLE usuarios 
ADD column IDROL int (10) not null default 1; // añadir una columna 
												a una tabla*/
                                                
ALTER TABLE ROLES
MODIFY COLUMN Descripcion varchar(255) not null;

create table ROLES(
	ID int (10) primary key auto_increment,
    Descripcion varchar (255) not null
    

);
select * from usuarios , ROLES;


INSERT INTO CARALIBRO.usuarios (idUsuario, email, fechaNacimiento, nombre, apellidos, sexo, activo, ciudad, bloqueado, numpassword,IDROL)
VALUES
('eros123@email.com', '1990-01-01', 'Eros', 'Muñoz', 'M', true, 'Valencia', false, 'hash1', '1'),
('paco123@email.com', '1995-05-15', 'Paco', 'Alcacer', 'F', true, 'Castañedas', false, 'hash2','1'),
('sergi123@email.com', '1988-11-20', 'Sergi', 'Ricart', 'M', true, 'Alicante', false, 'hash3','1'),
('usuario10@email.com', '1992-05-21', 'Juan', 'Gómez', 'M', true, 'Madrid', false, 'pass10','1'),
('usuario11@email.com', '1988-08-12', 'Ana', 'Martínez', 'F', true, 'Barcelona', false, 'pass11','1'),
('usuario12@email.com', '1995-02-28', 'Luis', 'Fernández', 'M', true, 'Sevilla', false, 'pass12','1'),
('usuario13@email.com', '1983-11-15', 'Laura', 'Rodríguez', 'F', true, 'Valencia', false, 'pass13','1'),
('usuario14@email.com', '1990-07-03', 'Carlos', 'Sánchez', 'M', true, 'Zaragoza', false, 'pass14','1'),
('usuario15@email.com', '1986-04-22', 'María', 'López', 'F', true, 'Bilbao', false, 'pass15','1');



INSERT INTO ROLES (Descripcion) VALUES
('Administrador'),
('Usuario Regular'),
('Moderador'),
('Editor'),
('Invitado'),
('Suscriptor'),
('Analista'),
('Desarrollador'),
('Tester'),
('Visitante');

SELECT
    usuarios.nombre,
    usuarios.apellidos,
    ROLES.Descripcion
FROM
    usuarios
    JOIN
    ROLES ON usuarios.IDROL = ROLES.ID;
    
SELECT
    usuarios.email,
    ROLES.Descripcion
FROM
    usuarios, ROLES
WHERE
    ROLES.IDROL = 1
    
AND
    usuarios.IDROL = ROLES.IDROL;
select * from CARALIBRO.ROLES;
select * from CARALIBRO.usuarios
/*idUsuarioselect * from ROLES;*/
/*select * from CARALIBRO.ROLES; // Muestra la tabla*/
/*SELECT idUsuario, email FROM usuarios; // Muestra los ids */
/*SELECT nombre, apellidos FROM usuarios WHERE idUsuario = 1; Muestra el nombre de la tabla usuarios con id 5*/
