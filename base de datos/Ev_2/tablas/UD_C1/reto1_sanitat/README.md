# Reto 1: Consultas básicas

Eros Muñoz Zanón.

En este reto trabajamos con la base de datos `sanitat`, que nos viene dada en el fichero `sanitat.sql`. A continuación realizamos una serie de consultas para extraer la información pedida en cada uno de los enunciados.

El código fuente correspondiente a este reto puede consultarse en: https://gitlab.com/ErosMZ/base-de-datos.git

## Query 1
Para seleccionar el número, nombre y teléfono de todos los hospitales existentes, seleccionaremos estos tres atributos, que se corresponden con las columnas `HOSPITAL_COD`, `NOM`, y `TELEFON`, respectivamente, de la tabla `HOSPITAL`. Lo llevaremos a cabo con la siguiente sentencia SQL:

```sql
SELECT HOSPITAL_COD,NOM,TELEFON FROM HOSPITAL;
```


## Query 2

Muestro  el número , nombre y el nombre de los hospitales que contengan en la segunda letra una "A".


`substring(NOM , 2 , 1) = "A";` en este comando le indico la posición con el número 2 y el número de cáracteres con el 1.

```sql
SELECT HOSPITAL.HOSPITAL_COD, HOSPITAL.NOM , HOSPITAL.TELEFON
from HOSPITAL
WHERE
 substring(NOM , 2 , 1) = "A";
```

También existe la opción `LIKE` y añadiendo `_` que indica que tiene un carácter delante y el `%` indica los carácteres detrás que sean 
```sql
select *
FROM HOSPITAL
WHERE NOM  like "_a%";
```
## Query 3
En este muestro todos los trabajadores que existen con los siguientes datos: código hospital, código sala, número empleado y apellido

El select lo uso para indicar las columnas que quiero mostrar y el from es ta tabla.
```sql
select PLANTILLA.HOSPITAL_COD , PLANTILLA.SALA_COD ,  PLANTILLA.EMPLEAT_NO, PLANTILLA.COGNOM
from PLANTILLA;
```
## Query 4
Aquí lo mismo que en el anterior pero añadiendo que muestre los trabajadores que no sean del turno de noche.

Con el where del ejercicio le digo que saque solamente los que en la columna turno ponga algo diferente a "N".
```sql
select PLANTILLA.HOSPITAL_COD , PLANTILLA.SALA_COD ,  PLANTILLA.EMPLEAT_NO, PLANTILLA.COGNOM
from PLANTILLA
where TORN != "N";
```
También hay otra opción que es:
```sql
select PLANTILLA.HOSPITAL_COD , PLANTILLA.SALA_COD ,  PLANTILLA.EMPLEAT_NO, PLANTILLA.COGNOM
from PLANTILLA
where TORN IN ("M" , "T");
```
Le estoy indicando que en la columna *TORN* tiene que haber una "M" o una "T"

## Query 5
Muestro de la tabla MALALS los enfermos nacidos en 1960 simplemente usando `YEAR (DATA_NAIX) = "1960";`
ya que le estamos indicando el año de *DATA_NAIX* que sea igual a 1960
```sql
select * from MALALT
 
where 
	YEAR (DATA_NAIX) => "1960";
```
También hay otra opción que es: 

```sql
select * from MALALT
 
where 
	substring(DATA_NAIX , 1 , 4) = "1960";
```
`substring(DATA_NAIX , 1 , 4) = "1960";` En este comando con el 1 indico la posición que quiero buscar y con el 4 el número de caracteres que cojo a partir de esa posición.
Y al final le escribo lo que busco que en este caso es "1960"

## Query 6
Muestro en la tabla MALATS los enfermos nacidos a partir del año 1960.

`DATA_NAIX >= "1960-01-01";` En este comando simplemente escribo que busque los mayores o iguales de la fecha "1960-01-01"

```sql
select  * from MALALT
where 
 DATA_NAIX >= "1960-01-01";

```
