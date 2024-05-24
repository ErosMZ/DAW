-- Muestra los países en los que tenemos al menos 5 clientes.

SELECT 
    Country
FROM 
    Customer
GROUP BY 
    Country
HAVING 
    COUNT(CustomerId) >= 5;