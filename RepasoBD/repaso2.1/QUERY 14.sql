-- Muestra el número de canciones del álbum “Out Of Time”

SELECT COUNT(Name) as Num_canciones FROM Track
where AlbumId in(
	
		select AlbumId from Album
        where Title like "Out Of Time"

);