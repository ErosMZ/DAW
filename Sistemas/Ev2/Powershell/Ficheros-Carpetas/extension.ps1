Host-Clear
$ruta = Read-Host "Dime la ruta donde quieres buscar los ficheros"
$extensión = Read-Host "Dime la extensión que buscas"
$rutaDes = "C:\$env:userprofile\Downloads"
Get-ChildItem -Path $ruta -File "*.$extension" | Copy-Item -Destination $rutaDes -Force
Write-Host "Los archivos con extensión $extensión han sido copiados a $rutaDes..."
#El -Force sobreescribe si hay uno igual 
