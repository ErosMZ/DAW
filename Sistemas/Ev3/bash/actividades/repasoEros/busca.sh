#!/bin/bash
read -p "Dime el nombre del usuario: " user

clear

VARIABLE=`grep $user /etc/passwd`
if [ -f /etc/passwd  ]
then
	if [ -z "$VARIABLE"  ]
	then
		echo "No, existe el usuario $user"
	else
		echo "Si, existe el usuario $user"
	fi
else
	echo no existe el fichero
fi
