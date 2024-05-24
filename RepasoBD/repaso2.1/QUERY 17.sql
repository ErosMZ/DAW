-- Muestra los álbumes ordenados por el número de canciones que tiene cada uno.

select Album.Title from Album 
ORDER BY (

	select COUNT(TrackId) 
    from Track
    where Album.AlbumId=Track.AlbumId
     
	
) Desc ;

