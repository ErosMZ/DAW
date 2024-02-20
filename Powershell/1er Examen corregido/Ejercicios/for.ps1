#Eros Muñoz Zanón
Clear-Host
$array = @()

#for(($i = 0); $i -lt 6; $i++){
#
#    $array[$i] = @(Get-Random -Minimum 1 -Maximum 49)
#    
#    for(($x = 0); $x -lt $i; $x++){
#        if($array[$i] -eq $array[$x]){
#            $array[$i] = @(Get-Random -Minimum 1 -Maximum 49)
#        }
#    }     
#    Write-Host $array[$i]
#}
while ($i -lt 7){
    $a = Get-Random -Maximum 7 -Minimum 1
    if ($array -notcontains $a){
        $array += $a
        $i++
    }
}
    [array]::Sort($array) #ordena de mayor a menor
    Write-Host $array

for(){

    $a = @(Get-Random -Minimum 0 -Maximum 49)
    
    if ($array -notcontains $a){
        $array += $a
        if ($array.Length -eq 5){
            break
        }
    }
}
    [array]::Sort($array) #ordena de mayor a menor
    Write-Host $array
