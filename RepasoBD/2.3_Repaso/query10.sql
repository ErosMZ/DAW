select FirstName, LastName, (

	select sum(Total) from Invoice
    where Customer.CustomerId = Invoice.CustomerId
	
) as Total from Customer
order by Total DESC
