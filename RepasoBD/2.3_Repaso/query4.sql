select * from Customer
where CustomerId in (

	select CustomerId from Invoice
    where Total > 20

)