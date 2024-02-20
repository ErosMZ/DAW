Clear-Host
#BONOLOTO

$boletos = Read-Host "Dime cuantos boletos quieres"
$arrayBoletos = @()
$arrayBoletos = ""

for(($a = 1);$a -le $boletos; $a++){
    
    $arrayBoletos += Get-Random -Maximum 9 -Minimum 0
    $arrayBoletos += " | "

    for(($b=1); $b -le 6 ;$b++){
        
        $arrayBoletos += Get-Random -Maximum 49 -Minimum 1
        $arrayBoletos += " "

    }

    Write-Host $arrayBoletos
    $arrayBoletos = ""

}