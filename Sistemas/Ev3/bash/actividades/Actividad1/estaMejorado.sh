#!/bin/bash
# Comprobar si un usuario está conectado

clear

for usuario in $*
	do
		TEST=`who | grep $usuario`
		if [ ! -z "$TEST"  ]
			then
				echo "El usuario $usuario está conectado"
			else
				echo "El usuario $usuario no está conectado"
			fi
	done
