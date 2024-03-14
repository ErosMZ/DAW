#!/bin/bash
clear 
read -p "Dime el nombre del fichero: " user
VARIABLE=`grep $user /etc/passwd`

echo
if [ -z "$VARIABLE" ]
then
	echo "No, $user no tiene un usuario creado en el sistema"
else
	echo "Si, $user tiene un usuario creado en el sistema"
fi
echo
