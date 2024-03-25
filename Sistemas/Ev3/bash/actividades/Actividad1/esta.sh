#!/bin/bash
clear
echo
read -p "Dime que usuario buscas: " user
VARIABLE=`who | grep $user`

if [ -z "$VARIABLE" ]
then
	echo "El usuario $user no está conectado"
else
	echo "El usuario $user está conectado"
fi
