select FirstName, LastName, (

	select count(CustomerId) from Customer
    where Customer.SupportRepId=Employee.EmployeeId

)as Num_Empleados from Employee