-- Muestra el número de países donde tenemos clientes.
select (
	select COUNT(distinct Country) from Customer
) as NumPaises
from Customer
group by NumPaises