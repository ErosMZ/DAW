#!/bin/bash
clear
read -p "Introduce el nombre del fichero: " fichero

if [ -f "$fichero" ]; then

	palabras=$(wc -w < $fichero)
	echo "el fichero $fichero contiene $palabras palabras "
else
	echo "El archivo no existe"
fi
