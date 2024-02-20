Clear-Host
Write-Host "1. Sumar"
Write-Host "2. Restar"
Write-Host "3. Multiplicar"
Write-Host "4. Dividir"
Write-Host "5. Potencia"
Write-Host ""
$QueVaHacer= Read-Host "¿Que quiere hacer?"
Clear-Host
$valor1= Read-Host "¿Dime el primer número?"
$valor2= Read-Host "¿Dime el segundo número?"

$valor1 = [int]$valor1
$valor2 = [int]$valor2

Clear-Host
if ($QueVaHacer -eq 1){
    $valor1 = $valor1
    $valor2 = $valor2
    $suma= $valor1 + $valor2
    Write-Host "El resultado de la suma $valor1 + $valor2 es $suma"
}
elseif($QueVaHacer -eq 2){
$valor1 = $valor1
$valor2 = $valor2
    $resta= $valor1 - $valor2
    Write-Host "El resultado de la resta $valor1 - $valor2 es $resta"
}
elseif($QueVaHacer -eq 3){
    $valor1 = $valor1
    $valor2 = $valor2
    $multi= $valor1 * $valor2
    Write-Host "El resultado de la multiplicación $valor1 * $valor2 es $multi"
}
elseif($QueVaHacer -eq 4){
    $valor1 = [double]$valor1
    $valor2 = [double]$valor2
    $multi= $valor1 * $valor2
    Write-Host "El resultado de la multiplicación $valor1 * $valor2 es $multi"
}
elseif($QueVaHacer -eq 5){
     $veces= 1
     $acumulador = 1
     $base= Read-Host "Dime la base"
     $exponente= Read-Host "Dime el exponente"
    while($veces -le $exponente){

        $acumulador = $acumulador * $base
        
        $veces++
        
    }
    Write-Host $acumulador
    
}
