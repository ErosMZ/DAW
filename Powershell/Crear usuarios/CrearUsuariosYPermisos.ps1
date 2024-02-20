Clear-Host

New-LocalGroup -Name "IES"
New-LocalGroup -Name "DAW"
New-LocalGroup -Name "DAM"

New-LocalUser -Name "Jaime"
New-LocalUser -Name "Belén"
New-LocalUser -Name "Marta"
New-LocalUser -Name "Luis"
New-LocalUser -Name "Carlos"
New-LocalUser -Name "Juan" -Description "Profesor"

Add-LocalGroupMember -Group "Usuarios" -Member "Jaime"
Add-LocalGroupMember -Group "Usuarios" -Member "Belén"
Add-LocalGroupMember -Group "Usuarios" -Member "Marta"
Add-LocalGroupMember -Group "Usuarios" -Member "Luis"
Add-LocalGroupMember -Group "Usuarios" -Member "Carlos"
Add-LocalGroupMember -Group "Usuarios" -Member "Juan"

Add-LocalGroupMember -Group "IES" -Member "Jaime"
Add-LocalGroupMember -Group "IES" -Member "Belén"
Add-LocalGroupMember -Group "IES" -Member "Marta"
Add-LocalGroupMember -Group "IES" -Member "Luis"
Add-LocalGroupMember -Group "IES" -Member "Carlos"
Add-LocalGroupMember -Group "IES" -Member "Juan"

Add-LocalGroupMember -Group "DAM" -Member "Belén"
Add-LocalGroupMember -Group "DAM" -Member "Marta"
Add-LocalGroupMember -Group "DAW" -Member "Luis"
Add-LocalGroupMember -Group "DAW" -Member "Carlos"


$ac1 = Get-Acl "C:\Senia"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("IES", "Read", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia"



$ac1 = Get-Acl "C:\Senia\Apuntes"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("Juan", "FullControl", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes"



$ac1 = Get-Acl "C:\Senia\Apuntes\DAW"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Read", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAW"

$ac1 = Get-Acl "C:\Senia\Apuntes\DAW"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Write", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAW"

$ac1 = Get-Acl "C:\Senia\Apuntes\DAW"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAW", "Execute", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAW"



$ac1 = Get-Acl "C:\Senia\Apuntes\DAM"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Read", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAM"

$ac1 = Get-Acl "C:\Senia\Apuntes\DAM"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Write", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAM"

$ac1 = Get-Acl "C:\Senia\Apuntes\DAM"
$rule = New-Object System.Security.AccessControl.FileSystemAccessRule("DAM", "Execute", "Allow")
$ac1.SetAccessRule($rule)
$ac1 | Set-Acl "C:\Senia\Apuntes\DAM"