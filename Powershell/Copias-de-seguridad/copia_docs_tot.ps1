Clear-Host
$ruta = "$HOME\Desktop\apuntes"
$destino= "F:\BACKUP\"
$date = Get-Date -Format "yyyy-MM-dd"
$nomZip = $destino + $date + "-docs_tot.zip"
Compress-Archive -Path $ruta -DestinationPath $nomzip -force
