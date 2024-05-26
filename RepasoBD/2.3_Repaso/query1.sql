Select * from Track;

Select Name From Track
where Milliseconds > (
	select avg(Milliseconds) from Track
)