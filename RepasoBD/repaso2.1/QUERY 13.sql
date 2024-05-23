-- Muestra el número total de artistas.


-- contar nombre haya o no repetidos
select ( 
	select COUNT(Name) from Artist 
) as total from Artist
group by total;

-- contar nombres sin contar los repetidos

select ( 
	select COUNT(distinct Name) from Artist 
) as total from Artist
group by total;
