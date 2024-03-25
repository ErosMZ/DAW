#!/bin/bash

#Comprueba si el script se ejecuta como administrador
if [ $EUID -ne 0 ]
then
	echo "Este escript debe ser ejecutado como administrador"
	exit 1
fi

#obtener la ubicación del archivo
#while infinito

while :
	read -p "Escribe la ruta del archivo" fichero
	if [[ -r $fichero  ]]
	then
		break
	else
		echo "error: el archivo no existe. Indroduce la ubicación nuevamente"
	fi
done

#IFS sirve para separar
while IFS=";" read login password grupo
do
	#login vale $login, password vale $password y grupo vale $grupo
	if [[ $login != "LOGIN"  ]]
	then
	#Crea el grupo si no existe

