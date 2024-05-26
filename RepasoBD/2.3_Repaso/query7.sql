SELECT *
FROM Album
WHERE AlbumId IN (
    SELECT AlbumId
    FROM (
        SELECT AlbumId, SUM(Milliseconds) AS TotalDuration
        FROM Track
        GROUP BY AlbumId
    ) AS AlbumDurations
    WHERE TotalDuration > (
        SELECT AVG(TotalDuration)
        FROM (
            SELECT SUM(Milliseconds) AS TotalDuration
            FROM Track
            GROUP BY AlbumId
        ) AS AvgDurations
    )
);