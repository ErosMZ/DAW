function Verificar-Contraseña {
    param (
        [string]$password
    )

    $arrayPassword = $password.ToCharArray()
    [int]$contador = 0

    if ($arrayPassword.Length -ge 10) {
        $contador++
    }

    for ($a = 0; $a -lt $arrayPassword.Length; $a++) {
        if ([char]::IsUpper($arrayPassword[$a])) {
            $contador++
            break
        }
    }

    for ($a = 0; $a -lt $arrayPassword.Length; $a++) {
        if ([char]::IsLower($arrayPassword[$a])) {
            $contador++
            break
        }
    }

    $caracteresEspeciales = "'-!#$%&()*,./:;?@[]^_`{|}~+<=>"
    $caracteresEspecialesChar = $caracteresEspeciales.ToCharArray()

    for ($b = 0; $b -lt $arrayPassword.Length; $b++) {
        for ($c = 0; $c -lt $caracteresEspecialesChar.Length; $c++) {
            if ($caracteresEspecialesChar[$c] -eq $arrayPassword[$b]) {
                $contador++
                break
            }
        }
    }

    if ($contador -eq 4) {
        Write-Host "Su contraseña cumple con los requisitos"
    } else {
        Write-Host "Su contraseña no cumple con los requisitos"
    }
}

# Uso de la función
Clear-Host
$password = Read-Host "Dime la contraseña"
Verificar-Contraseña -password $password
