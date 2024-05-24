-- Encuentra los géneros musicales más populares (los más comprados).
SELECT 
    Genre.Name, 
    COUNT(InvoiceLine.TrackId) AS NumberOfPurchases
FROM 
    Genre
JOIN 
    Track ON Genre.GenreId = Track.GenreId
JOIN 
    InvoiceLine ON Track.TrackId = InvoiceLine.TrackId
GROUP BY 
    Genre.Name
ORDER BY 
    NumberOfPurchases DESC;
    
    
SELECT 
    Name 
FROM 
    Genre
WHERE 
    GenreId IN (
        SELECT 
            GenreId 
        FROM 
            Track
        WHERE 
            TrackId IN (
                SELECT 
                    TrackId 
                FROM 
                    InvoiceLine
            )
    )
ORDER BY 
    (
        SELECT 
            COUNT(InvoiceLine.TrackId) 
        FROM 
            InvoiceLine
        WHERE 
            InvoiceLine.TrackId IN (
                SELECT 
                    TrackId 
                FROM 
                    Track
                WHERE 
                    Track.GenreId = Genre.GenreId
            )
    ) DESC;
