#Clear-host

#wbadmin get versions
#Read-Host

Clear-Host
$usuario = Read-Host "Dime el nombre de usuario"
$contraseña = Read-Host "Dime la contraseña del usuario"

wbadmin start backup -backupTarget:"\\Sergi\NuevaCarpeta" -include:C:\Users\Administrador\Desktop\ejer_pw -user:$usuario -password:$contraseña -quiet


#wbadmin enable backup –addtarget:\\backupshare\backup1 –include: D:\documents –user:juan –password:12345 –schedule:00:00,19:00

# wbadmin start backup -backupTarget:G: -include:C:\Users\Administrador\Desktop\ejer_pw -quiet
# wbadmin start backup -backupTarget:\\Wserver-profe\compartir -include:C:\Users\Administrador\Desktop\ejer_pw -quiet
# wbadmin enable backup –addtarget:H: –include T:,D:\documents –exclude D:\documents\~tmp –vssfull –schedule:01:00
