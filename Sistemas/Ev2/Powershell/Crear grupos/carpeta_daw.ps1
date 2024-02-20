Clear-Host
$nombreCarpeta= "DAW-SI"
$nombreCarpetaRuta= "c:\DAW-SI"

if(-not(Test-Path -Path $nombreCarpetaRuta)){

    New-Item -Name $nombreCarpeta -Path "c:\" -ItemType Directory

}else{

    Write-Host "Este archivo ya existe"

}


New-LocalGroup -Name "Profesores"
New-LocalGroup -Name "Alumnos"


$acl = Get-Acl "c:\DAW-SI"
$regla = New-Object  System.Security.AccessControl.FileSystemAccessRule("Profesores", "Write", "Allow")
$acl.SetAccessRule($regla)
$acl | Set-Acl "C:\DAW-SI"

$acl = Get-Acl "c:\DAW-SI"
$regla = New-Object  System.Security.AccessControl.FileSystemAccessRule("Alumnos", "Read", "Allow")
$acl.SetAccessRule($regla)
$acl | Set-Acl "C:\DAW-SI"
