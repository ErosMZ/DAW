# Reto 2: Consultas básicas

EROS MUÑOZ ZANÓN.

En este reto trabajamos con la base de datos `empresa` y `videoclub`. A continuación realizamos una serie de consultas para extraer la información pedida en cada uno de los enunciados.

El código fuente correspondiente a este reto puede consultarse en: https://gitlab.com/ErosMZ/base-de-datos.git

## Query 1 EMPRESA
He seleccionado la descipción y el id con el `SELECT` y la tabla __PRODUCTE__ con el `FROM`.

```sql
select PRODUCTE.DESCRIPCIO , PRODUCTE.PROD_NUM
from PRODUCTE
```

También tenemos este ejemplo ya que en la tabla solamente contiene la columna descripción y el id.
```sql
select *
from PRODUCTE
```
## Query 2 EMPRESA

Muestro la tabla completa con `select * from PRODUCTE`. Y con el `LIKE "%TENNIS%"` indico que contenga la palabra tennis sin importar lo que haya a los dos lados.  

```sql
select * from PRODUCTE
WHERE PRODUCTE.DESCRIPCIO LIKE "%TENNIS%";
```

## Query 3 EMPRESA
Aqui simplemente he indicado con el `select` las columnas que quiero que se muestren que en este caso es __CLIENT_COD, NOM, AREA y TELEFON__ y  con el ``from` le he indicado la tabla __CLIENT__.
```sql
select CLIENT_COD , NOM , AREA , TELEFON
from CLIENT
```
## Query 4 EMPRESA
En el `select` he indiacado las columnas que quiero que se impriman que en este caso es __CLIENT_COD, NOM y CIUTAT__.

Con el `FROM` le he indicado la tabla __CLIENT__.

En el `WHERE` he indicado que en la columna __AREA__ sea diferente a 636.
```sql
select CLIENT_COD, NOM, CIUTAT FROM CLIENT
WHERE AREA != "636"
```

## Query 5 EMPRESA
Aquí simplemente he indicado las columnas que quiero que se impriman que en este caso son __COM_NUM , COM_DATA y DATA_TRAMESA__ y la tabla __COMANDA__.
```sql
select COM_NUM , COM_DATA , DATA_TRAMESA 
from COMANDA
```


## Query 1 VIDEOCLUB

En este caso he indicado con el `SELECT` las columnas a imprimir que son __NOM Y TELEFON__ y con el ``FROM` he elegido la tabla __CLIENT__.

```sql
SELECT NOM , TELEFON FROM CLIENT
```
## Query 2 VIDEOCLUB

En este caso he indicado con el `SELECT` las columnas a imprimir que son __Data e Import__ y con el ``FROM` he elegido la tabla __FACTURA__.
```sql
SELECT Data , Import FROM FACTURA
```

## Query 3 VIDEOCLUB

En este caso he indicado con el `SELECT` la columna __Descripcio__ de la tabla __DETALLFACTURA__ y en el `WHERE` he indicado que solamente se impriman las facturas que en la columna __CodiFacura__ haya un *3*.
```sql
select Descripcio from  DETALLFACTURA
where CodiFactura like "3"
```
## Query 4 VIDEOCLUB
En este caso he con el `select * from FACTURA` hago que imprima toda la tabla __FACTURA__.
Y con el comando `Order by Import desc` consigo que imprima la tabla de forma descendente dependiendo de lo que haya en la columna __Import__.
```sql
select * from FACTURA
Order by Import desc
```
## Query 5 VIDEOCLUB

En este caso he seleccionado la tabla __ACTOR__ completa pero añadiendo esta opción  `where Nom like "X%"`.
Que indica que el nombre empieza por *X* y detrás de ella hay cualquier cosa.
```sql
select * from ACTOR
where Nom like "X%"
```