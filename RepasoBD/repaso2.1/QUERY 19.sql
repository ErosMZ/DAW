-- Lista los 6 álbumes que acumulan más compras.

SELECT 
    Album.Title 
FROM 
    Album
JOIN 
    Track ON Track.AlbumId = Album.AlbumId
JOIN 
    InvoiceLine ON InvoiceLine.TrackId = Track.TrackId
GROUP BY 
    Album.Title
ORDER BY 
    COUNT(InvoiceLine.InvoiceLineId) DESC
LIMIT 6;


