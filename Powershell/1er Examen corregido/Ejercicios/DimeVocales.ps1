Clear-Host

$palabra = Read-Host "Dime la pablabra"

#esto hace que $palabra se meta en una array separando las letras en carácteres
$palabraCaracteres = $palabra.ToCharArray()


$contador = 0
for(($x = 0);$x -lt $palabraCaracteres.Length; $x++){

     switch ($palabraCaracteres[$x]){
        "A"{
            $contador += 1
        }
        "e"{

            $contador += 1

        }
        "I"{

             $contador += 1

        }
        "O"{

             $contador += 1
           
        }
        "U"{

             $contador += 1
           
        }
    }
    
}
Write-Host    
Write-Host " Tiene $contador vocales"
        
    
    
    
