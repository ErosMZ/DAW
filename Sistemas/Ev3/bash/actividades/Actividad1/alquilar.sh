#!/bin/bash

salir=0

while [ "$salir" -eq 0 ]; do
	clear

	echo "Coche (1)"
	echo "Furgoneta (2)"
	echo "Bicicleta (3)"
	echo "Salir (4)"
	read -p "Dime que quieres alquilar (1 , 2 , 3): " vehiculo

	clear

	if [ $vehiculo  -eq 1 ]
	then
		echo "Coche: 20€/km"
	elif [ $vehiculo -eq 2  ]
	then
		echo "Furgoneta: 10€/km"
	elif [ $vehiculo -eq 3  ]
	then
		echo "Bicicleta: 5€/km"
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
