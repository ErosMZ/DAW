ç#!/bin/bash
clear

read -p "Dime el nombre del archivo: " archivo

if [ -f $archivo  ]
then
	grep -o -E "\W+" $archivo | sort | uniq -c
else
	echo archivo no encontrado
fi
