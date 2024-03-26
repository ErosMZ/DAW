#!/bin/bash
bonoloto=()
for i in {1..6}; do
    existe=1
    while [ $existe -eq 1 ]; do
        num=$(( RANDOM % 49 + 1 ))
        existe=0
        for val in "${bonoloto[@]}"; do
            if [ $val -eq $num ]; then
                existe=1
                break
            fi
        done
    done
    bonoloto+=($num)
done

# Ordenar los primeros seis números
bonoloto_ordenada=($(for i in "${bonoloto[@]}"; do echo $i; done | sort -n))

# Generar el número adicional que ha tocado
num_tocado=$(( RANDOM % 49 + 1 ))

# Añadir el número que ha tocado al final sin ordenar
bonoloto_ordenada+=($num_tocado)

echo "Tu jugada de la bonoloto es: ${bonoloto_ordenada[@]}"
