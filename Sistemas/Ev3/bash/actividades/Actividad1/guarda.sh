#!/bin/bash
clear
cp ./*
if [ ! -d ./seguridad  ]
then
	echo "no existe el directorio lo voy a crear"
	mkdir ./seguridad
fi
cp ./*
echo "Se  han guardado los ficheros"
