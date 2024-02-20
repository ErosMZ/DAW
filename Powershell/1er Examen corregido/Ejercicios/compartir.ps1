$nombreRecurso= read-host "Dime el nombre del recurso"

$rutaSimple = "C:\Users\erosm\OneDrive\Escritorio"
$rutaRecursoCompleta= "C:\Users\erosm\OneDrive\Escritorio\$nombreRecurso"

New-Item -Path $rutaSimple -Name $nombreRecurso -ItemType Directory

New-SmbShare -Name $nombreRecurso -Path $rutaRecursoCompleta
Grant-SmbShareAccess -Name $nombreRecurso -AccountName "prueba" -AccessRight Full -Force
Grant-SmbShareAccess -Name $nombreRecurso -AccountName "Modifica" -AccessRight Read -Force
