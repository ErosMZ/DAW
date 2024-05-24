-- Muestra el número de canciones de cada género (deberá mostrarse el nombre del género).

SELECT 
    Genre.Name , 
    COUNT(Track.TrackId) AS NumeroCanciones
FROM 
    Genre
JOIN 
    Track ON Genre.GenreId = Track.GenreId
GROUP BY 
    Genre.Name
ORDER BY 
    NumeroCanciones DESC;
    
select Name, (

	SELECT COUNT(Track.TrackId) FROM Track
    where Genre.GenreId = Track.GenreId

) as NumCanciones from Genre
ORDER BY 
    NumCanciones DESC;


