use videoclub;

select * from GENERE;
select * from PELICULA;

select PELICULA.Titol , GENERE.Descripcio
from PELICULA
join GENERE on PELICULA.CodiGenere=GENERE.CodiGenere;

