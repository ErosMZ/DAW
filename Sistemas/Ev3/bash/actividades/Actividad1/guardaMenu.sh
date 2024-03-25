#!/bin/bash
clear
echo 1. Copiar ficheros
echo 2. Salir

While :  do
	echo "Menú de opciones"
	echo "1. Guardar archivos"
	echo "2. Salir"
	read -p "Opción: " OPCION

	case "$OPCION" in
	1) 
	cp ./*
	if [ ! -d ./seguridad  ]
	then
        	echo "no existe el directorio lo voy a crear"
        	mkdir ./seguridad
	fi

	cp ./*
	echo "Se  han guardado los ficheros"
	;;
	2)
		echo "Saliendo del programa"
		exit 0
	;;
	*)
	echo "Opción inválida"
	esac
done
