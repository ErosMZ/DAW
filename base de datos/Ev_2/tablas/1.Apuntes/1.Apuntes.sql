select *
FROM HOSPITAL
WHERE NOM  like "%a%";

select *
FROM HOSPITAL
WHERE NOM  like "_a%";
-- que haya 1 carácter delante y los que sean detrás

SELECT HOSPITAL.HOSPITAL_COD, HOSPITAL.NOM , HOSPITAL.TELEFON
from HOSPITAL
WHERE
 substring(NOM , 2, 1) = "A";
 select * from HOSPITAL;
 
SELECT HOSPITAL.HOSPITAL_COD, HOSPITAL.NOM , HOSPITAL.TELEFON
from HOSPITAL
WHERE
 substring(NOM , 2 , 1) = "A";
 
select PLANTILLA.HOSPITAL_COD , PLANTILLA.SALA_COD ,  PLANTILLA.EMPLEAT_NO, PLANTILLA.COGNOM
from PLANTILLA
where TORN != "N";

select * from MALALT
where 
	YEAR (DATA_NAIX) = "1960";
    
select * from MALALT
where 
	substring(DATA_NAIX , 1 , 4) = "1960";
    
    USE empresa;
    DROP DATABASE videoclub;

select fotos.idFoto, fotos.descripcion, fotos.fechaCreacion, tiposReaccion.descripcion
from reaccionesFotos , fotos, tiposReaccion
where reaccionesFotos.idUsuario = 11
    and reaccionesFotos.idFoto= fotos.idFoto
    and reaccionesFotos.idTipoReaccion= 4
    and tiposReaccion.idTipoReaccion = reaccionesFotos.idTipoReaccion;

USE empresa
SELECT *
FROM EMP
ORDER BY COMISSIO DESC
LIMIT 2;
-- EL LIMITE HACE QUE MUESTRE UN NUMERO DE PERSONAS

USE empresa;
SELECT COUNT(distinct OFICI)
FROM EMP;
--  cuenta la cantidad de valores únicos en la columna llamada "OFICI" de la tabla "EMP" y devuelve ese conteo.

INSERT INTO ACTOR
values INSERT INTO ACTOR
VALUES (4 , "XIMO") , (5 , "XORDI") , (6 , "XAVI") ;
-- INSERTA EN LA TABLA ACTOR LOS VALORES (4 , XIMO) // (5 , "XORDI") // (6 , "XAVI")

INSERT INTO ACTOR
(Nom, CodiActor)
VALUES
("Paco", 8);
-- INSERTAR EN LA TABLA ACTOR LO MISMO PERO CAMBIANDO EL ORDEN AL METERLO 
-- (AL MOSTRAR LA TABLA NO CAMBIA EL ORDEN SOLO SIRVE PARA CAMBIAR EL ORDEN DE EJECUCIÓN)

DELETE FROM ACTOR
	WHERE CodiActor in (9,11);
-- borra Los que tienen codigo actor 9 o 11

DELETE FROM ACTOR
	WHERE CodiActor between 9 and 10;
-- borra los que entán entre el 9 y el 11 (también se incluye el 9 y el 10)