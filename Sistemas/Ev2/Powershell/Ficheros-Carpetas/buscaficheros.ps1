#buscarficheros
$UnidadLógica= Read-Host "Dime la unidad lógica"

#$ruta=  New-Item -ItemType File -Path "${UnidadLógica}:\$env:userprofile\\uwu\file.txt"

$RutaDirectorio = Join-Path -Path "${UnidadLógica}:\$env:userprofile\uwu" -ChildPath ""
$RutaArchivo = Join-Path -Path $RutaDirectorio -ChildPath "file.txt"
New-Item -ItemType File -Path $RutaArchivo -Force
#"C:\$env:userprofile\Downloads"