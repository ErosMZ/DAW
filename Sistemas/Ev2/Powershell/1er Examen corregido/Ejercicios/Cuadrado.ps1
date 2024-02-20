
Clear-Host

$veces = Read-Host "Dime cuantas líneas quieres"
for(($a=1);$a -le $veces;$a++){
    for(($b=1);$b -le 5 ;$b++){
        $linea +=  "$a "
       
    }

     Write-Host $linea
     Write-Host
     $linea = ""

}
Read-Host "Presiona Enter para continuar..."


Clear-Host


$veces1 = $veces = Read-Host "Dime cuantas líneas quieres"

$vecesFor= $veces

for(($x = 1); $x -le $veces; $x++){
    
    for(($j=1);$j -le 5; $j++){
    
        $linea2 += "$vecesFor "
        
    }

    $vecesFor -= 1
    Write-Host $linea2
    $linea2 = ""

}
