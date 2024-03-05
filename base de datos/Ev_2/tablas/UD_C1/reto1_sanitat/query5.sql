select * from MALALT
 
where 
	substring(DATA_NAIX , 1 , 4) = "1960";

select * from MALALT
 
where 
	YEAR (DATA_NAIX) => "1960";