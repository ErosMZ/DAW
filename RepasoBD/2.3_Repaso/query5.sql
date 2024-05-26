SELECT Title, (
    SELECT Name 
    FROM Artist
    WHERE Artist.ArtistId = Album.ArtistId
) AS Artista 
FROM Album
WHERE AlbumId IN (
    SELECT AlbumId 
    FROM Track
    GROUP BY AlbumId
    -- Filtra grupos de resultados después de que se han aplicado las funciones de agregación.
    HAVING COUNT(TrackId) > 15
);


