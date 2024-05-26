SELECT * FROM Album
WHERE AlbumId IN (
    SELECT AlbumId
    FROM Track
    GROUP BY AlbumId
    HAVING COUNT(TrackId) > (
        SELECT AVG(song_count)
        FROM (
            SELECT COUNT(TrackId) AS song_count
            FROM Track
            GROUP BY AlbumId
        ) AS album_song_counts
    )
);
