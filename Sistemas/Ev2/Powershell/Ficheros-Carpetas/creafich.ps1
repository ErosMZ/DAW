#crearfich.ps1


Clear-Host


$final=1
while($final -le 1){
    Clear-Host
    
    Write-Host "A. Crear archivo"
    Write-Host "B. Copiar fichero"
    Write-Host "C. Borrar fichero"
    Write-Host "D. Mover Fichero"
    Write-Host "E. Salir"
    Write-Host

    $letra = Read-Host "Que quiere hacer"

    switch ($letra){
        "A"{

            $ruta = Read-Host "Dime la ruta completa"
            $fichero= Read-Host "Dime el nombre del fichero"
            New-Item -Path $ruta\$fichero
            Write-Host
        }
        "B"{
            
            $ruta = Read-Host "Dime la ruta completa del fichero"
            $fichero= Read-Host "Dime el nombre del fichero"
            $destino= Read-Host "Dime la ruta completa donde quiere pegarlo"
            $nomFichero = Copy-Item -Path $ruta\$fichero -Destination $destino
            Write-Host "Su fichero $fichero ha sido copiado en $destino "

        }
        "C"{
            
            $ruta = Read-Host "Dime la ruta completa del fichero"
            $fichero = Read-Host "Dime el nombre del fichero"
            Remove-Item -Path $ruta\$fichero

        }
        "D"{
        
            $ruta = Read-Host "Dime la ruta completa del fichero"
            $fichero = Read-Host "Dime el nombre del fichero"
            $destino = Read-Host "Dime la ruta completa a donde quieres moverla"
            Move-Item -Path $ruta\$fichero -Destination $destino
        
        }
        "E" { 

              break

        }
   

    }
    Read-Host "Presiona ENTER para continuar... "
    
}

#con directorios
<#Clear-Host

$final = 1
while ($final -le 1) {
    Clear-Host

    Write-Host "A. Crear carpeta"
    Write-Host "B. Copiar carpeta"
    Write-Host "C. Borrar carpeta"
    Write-Host "D. Mover carpeta"
    Write-Host "E. Salir"
    Write-Host
    $letra = Read-Host "¿Qué desea hacer?"
    switch ($letra) {
        "A" {
            $ruta = Read-Host "Ingrese la ruta completa"
            $carpeta = Read-Host "Ingrese el nombre de la carpeta"
            New-Item -ItemType Directory -Path "$ruta\$carpeta"
            Write-Host
        }
        "B" {
            $ruta = Read-Host "Ingrese la ruta completa de la carpeta"
            $carpeta = Read-Host "Ingrese el nombre de la carpeta"
            $destino = Read-Host "Ingrese la ruta completa donde desea copiarla"
            Copy-Item -Recurse -Path "$ruta\$carpeta" -Destination $destino
            Write-Host "La carpeta $carpeta ha sido copiada en $destino"
        }
        "C" {
            $ruta = Read-Host "Ingrese la ruta completa de la carpeta"
            $carpeta = Read-Host "Ingrese el nombre de la carpeta"
            Remove-Item -Recurse -Path "$ruta\$carpeta"
            #-recurse hace que tambien mueva los archivos que tiene dentro
        }
        "D" {
            $ruta = Read-Host "Ingrese la ruta completa de la carpeta"
            $carpeta = Read-Host "Ingrese el nombre de la carpeta"
            $destino = Read-Host "Ingrese la ruta completa a donde desea moverla"
            Move-Item -Path "$ruta\$carpeta" -Destination $destino
        }
        "E" {
            break
        }
    }
    Read-Host "Presione ENTER para continuar... "
}#>