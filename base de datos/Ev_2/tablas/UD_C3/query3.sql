USE VIDEOCLUB;
SELECT PELICULA.Titol , PELICULA.SegonaPart , ACTOR.Nom
FROM ACTOR
JOIN PELICULA
ON ACTOR.CodiActor = PELICULA.CodiActor;
SELECT * FROM ACTOR