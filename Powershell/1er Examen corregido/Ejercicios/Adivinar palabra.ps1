Clear-Host
$palabra = Read-Host "Dime la palabra"

#mete en la array la palabra separado en forma de caracter
$letras = $palabra.ToCharArray()
$tamañoArray= $letras.Length
for(){

    Clear-Host


    $acumulador = 0
    $letra = Read-Host "Dime la letra que buscas"

    for(($a=0); $a -lt $letras.Length; $a++){
        
        if ($letras[$a] -eq $letra){

            $acumulador++
            Write-Host "La letra $letra esta en la posición $a de $tamañoArray"

        }
    }

    if($acumulador -eq 0){

        Write-Host "No hay letra $letra"

    }else{

        Write-Host "hay $acumulador"

    }

    $Seguir = Read-Host "Quiere seguir (s/n)"


    if($Seguir -eq "n"){

        break

    }else{

        Read-Host "Presiona ENTER para continuar..."

    }
    
}