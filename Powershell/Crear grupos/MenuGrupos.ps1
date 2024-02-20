Clear-Host
for(){
Clear-Host
    Write-Host "1. Listar los usuarios del sistema"
    Write-Host "2. Crear usuario"
    Write-Host "3. Cambiar contraseña de un usuario"
    Write-Host "4. Desactivar usuario"
    Write-Host "5. Borrar usuario"
    Write-Host "6. Listar los grupos del usuario del sistema"
    Write-Host "7. Listar miembros de un grupo"
    Write-Host "8. Crear un grupo"
    Write-Host
    $opcion = Read-Host "Dime la opción"
    Clear-Host

    switch($opcion){
    
       "1" {
           
           Get-LocalUser

       }

       "2"{
            
            $nombreUsuario= Read-Host "Dime el nombre del usuario"
            $Contrasena= Read-Host "Dime la contraseña"
            $contrasena1 = ConvertTo-SecureString "$contrasena" -AsPlainText -force
            New-LocalUser -Name $nombreUsuario -Password $contrasena1

            Write-Host "Se ha creado el usuario $nombreUsuario con la contraseña $contrasena"
            Read-Host "Presiona ENTER para continuar"

       }
       "3"{
       
            $nombre = Read-Host "Dime el nombre del usuario"
            $password = Read-Host "Dime la contraseña"
            Set-LocalUser -Name $nombreUsuario -Password (ConvertTo-SecureString "$password" -AsPlainText -force)

       }
       "4"{
       
            $nombre = Read-Host "Dime el nombre del usuario"
            Disable-LocalUser -Name $nombre
       }
       "5"{
       
            $nombre = Read-Host "Dime el nombre del usuario"
            Remove-LocalUser -Name $nombre
       
       }
       "6"{
       
            Get-LocalGroup
       
       }
       "7"{
       
            $nombreGrupo = Read-Host "Dime el nombre del grupo"
            Get-LocalGroupMember -Group $nombreGrupo
       
       }
       "8"{
            
            $nombreGrupo = Read-Host "Dime el nombre del grupo"
            New-LocalGroup -Name $nombreGrupo
        
       }
       "9"{
            
            $nombreGrupo = Read-Host "Dime el nombre del grupo"
            Remove-LocalGroup -Name $nombreGrupo

       }
       "10"{
            $nombreGrupo = Read-Host "Dime el nombre del grupo"
            $nombreUser = Read-Host "Dime el nombre del usuario"
            Add-LocalGroupMember -Group "$nombreGrupo" -Member "$nombreUser"
           
       }
       "11"{
            $nombreGrupo = Read-Host "Dime el nombre del grupo"
            $nombreUser = Read-Host "Dime el nombre del usuario"
            Remove-LocalGroupMember -Group "$nombreGrupo" -Member "$nombreUser"
       
       }
       "12"{
       
            break
       
       }
    }


}
