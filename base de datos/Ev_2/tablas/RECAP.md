# Unidad C0: Recapitulación

Eros MUñoz Zanón.

Voy a presentaros los principales conceptos de las BD y sus características y como funciona el sistema de Cliente-Servidor
## Concepto y origen de las bases de datos
¿Qué son las bases de datos? ¿Qué problemas tratan de resolver? Definición de base de datos.

## Sistemas de gestión de bases de datos
__DBMS:__ Es el sistema que se encarga de gestionar las bases de datos, te permite el almacenamiento y la estructura del orden de los datos.

Las siglas significan "DATABASE MANAGEMENT SYSTEM" que traducido al español sería "SISTEMA DE GESTIÓN DE BASE DE DATOS"

### Ejemplos de sistemas de gestión de bases de datos
¿Qué DBMS se usan a día de hoy? ¿Cuáles de ellos son software libre? ¿Cuáles de ellos siguen el modelo cliente-servidor?

* __Software Libre__ = SQLite / MariaDB / PostgreSQL / MySQL
* __Modelo cliente servidor:__ = Oracle DB / IDM Db2 / SQLite / MAriaDB / SQL Server / PostgreSQL / MySQL

## Modelo cliente-servidor
Colocar un sistema de Gestión de Bases de Datos en un servidor hace que mejore el rendimiento hace más facil la administración y la seguridad de los datos.
También muchos servidores facilitan la recuperación y el respaldo de los datos de las bases de datos.

Las ventajas que tiene desacoplar al DBMS del cliente son como por ejemplo acceder a la bases de datos desde diferentes ubicaciones y es más eficiente a la hora de administrar volúmenes muy grandes.

El modelo cliente servidor se basa en que un hardware solicita servicios y el servidor proporciona esos servicios.
Esa comunicación se consigue mediante una red de intercambio de solicitudes y respuestas

* __Cliente__: Es el hardware que se encarga de mandar una petición al servidor para que el haga una acción.
* __Servidor__: Es el software/hardware encargado de recibir las peticiones del cliente y las ejecuta.
* __Red__: Se encarga de hacer la conexión entre el cliente y el servidor
* __Puerto de escucha__: Lugar donde se conecta la red y consigue que funcione la conectividad
* __Petición__: Es la acción que le pide el cliente al servidor para que haga.
* PostgreSQL
* mySQL

#### DML: Lenguaje de manipulación de datos
Permite llevar a cabo la maniculación de los datos ya sea con consultas haciendo tareas ect.
http://cidecame.uaeh.edu.mx/
#### DCL: Lenguaje de control de datos
Permite que el administrador pueda controlar el acceso a los datos de la BD.
https://es.wikipedia.org
#### TCL: Lenguaje de control transaccional
Permite manipular las diferentes transacciones de una base de datos
https://platzi.com/
## Bases de datos relacionales
¿Qué es una base de datos relacional? ¿Qué ventajas tiene? ¿Qué elementos la conforman?
Una base de datos relacional trata de serie de información que los datos vienen con relaciones predefinidas.
https://cloud.google.com/

__Las ventajas pueden ser:__ Seguridad, una estructura organizada, flexibilidad en consultas y un mantenimiento sencillo
* __Relación (tabla)__: Trata de una tabla juntar dos tablas al menos entre si ya que tienen datos que las dos pueden compartir.
* __Atributo/Campo (columna)__: Representa una característica específica y dentro de ella hay datos que concuerda con la característica
* __Registro/Tupla (fila)__: Representa un registro único
