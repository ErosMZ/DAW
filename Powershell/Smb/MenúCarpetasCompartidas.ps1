
for(){
Clear-Host
Write-Host "1. Crear recurso compartido (nombre del recurso, path)"
Write-Host "2. Muestra información de los recursos compartidos"
Write-Host "3. Muestra información detallada de un recurso. Solicitar el nombre del recurso compartido"
Write-Host "4. Modificar recurso (pide recurso y descripción y se cambia)"
Write-Host "5. Eliminar recurso compartido (Pide recurso)"
Write-Host "6. Añadir permiso de un usuario a un recurso (pide recurso, usuario y permiso)"
Write-Host "7. Eliminar permiso a un usuario (pide recurso, usuario y permiso)"
Write-Host "8. Denegar acceso de un usuario a recurso (pide recurso y usuario)"
Write-Host "9. Desbloquear acceso a recurso (pide recurso y usuario)"
Write-Host "10. Salir"
Write-Host

$accion = Read-Host "Dime que quiere hacer"

switch($accion){

    1 {
        $ruta = Read-Host "Dime la ruta absoluta"
        $nombreFichero= Read-Host "Dime el nombre de la carpeta"
        New-SmbShare -Name $nombreFichero -Path $ruta
        Read-Host "Presiona ENTER para continuar..."
      }

    2 {
        Get-SmbShare
        Read-Host "Presiona ENTER para continuar..."
      }

    3 {
        $nombreFichero= Read-Host "Dime el nombre de la carpeta"
        Get-SmbShare -Name $nombreFichero | Format-List
        Read-Host "Presiona ENTER para continuar..."
      }

    4{
        $nombreFichero = Read-Host "Ingrese el nombre del recurso compartido"
        $Descripcion = Read-Host "Ingrese la nueva descripción"
        Set-SmbShare -Name $nombreFichero -Description $Descripcion
        Read-Host "Presiona ENTER para continuar..."
     }

    5{
        $nombreFichero = Read-Host "Dime el nombre del recurso compartido"
        Remove-SmbShare -Name $nombreFichero
        Read-Host "Presiona ENTER para continuar..."
    
     }

     6{
        $nombreFichero = Read-Host "Dime el nombre del recurso compartido"
        $user = Read-Host "Dime el nombre del usuario"
        $permiso = Read-Host "Dime el permiso (Ejem: Read / Change / Full)"
        Grant-SmbShareAccess -Name $nombreFichero -AccountName $user -AccessRight $permiso
        Read-Host "Presiona ENTER para continuar..."
      }

     7{
        $nombreFichero = Read-Host "Dime el nombre del recurso compartido"
        $user = Read-Host "Dime el nombre del usuario"
        $permiso = Read-Host "Dime el permiso que quieres eliminar"
        Revoke-SmbShareAccess -Name $nombreFichero -AccountName $user -AccessRight $permiso
        Read-Host "Presiona ENTER para continuar..."
      
      }
     8{
        $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido"
        $nombreUsuario = Read-Host "Ingrese el nombre de usuario"
        Remove-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario -Force
        Read-Host "Presiona ENTER para continuar..."

      }

      9{
         $nombreRecurso = Read-Host "Ingrese el nombre del recurso compartido"
         $nombreUsuario = Read-Host "Ingrese el nombre de usuario"
         Grant-SmbShareAccess -Name $nombreRecurso -AccountName $nombreUsuario
         Read-Host "Presiona ENTER para continuar..."
       }
      10{
            break
      
        }
}

}
$ruta = "C:\Users\tana2\OneDrive\Desktop\paco2"
New-SmbShare -Name "Compartido" -Path $ruta -FullAccess "Users"