Get-Process

#Muestra todos los servicios
$nombre = Read-Host "Dime el nombre del servicio"
Stop-Service -Name $nombre
#Eliminar el servicio con el nombre que de dice 

