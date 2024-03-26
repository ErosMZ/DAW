#!/bin/bash
read -p "Dime el nombre del usuario: " user

VARIABLE=`who | grep $user`

if [ -z "$VARIABLE" ]
then
	echo "No está conectado el usuario $user"
else
	echo "Si está conectado el usuario $user"
fi
