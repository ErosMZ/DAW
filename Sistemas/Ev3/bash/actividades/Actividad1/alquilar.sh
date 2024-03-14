#!/bin/bash

salir=0
declare -A diccionario
diccionario=([1]='20€/km' [2]='10/km' [3]='5€/km')
while [ "$salir" -eq 0 ]; do

	clear

	echo "Coche (1)"
	echo "Furgoneta (2)"
	echo "Bicicleta (3)"
	echo "Salir (4)"
	read -p "Elige una opción: " vehiculo

	clear

	if [ $vehiculo  -eq 1 ]
	then
		echo "Coche: ${diccionario[1]}"
	elif [ $vehiculo -eq 2  ]
	then
		echo "Furgoneta: ${diccionario[2]}"
	elif [ $vehiculo -eq 3  ]
	then
		echo "Bicicleta ${diccionario[3]}"
	elif [ $vehiculo -eq 4 ]
	then
		let salir+=1
	else
		echo "$vehiculo no es un valor válido"
	fi
	if [ $salir -eq 0  ]

	then
		read -p "Presiona ENTER para continuar..."
	fi
done
