#!/bin/bash
clear
echo "Numero de variables pasados como parametros: $#"
echo "Estás con las variables: $*"
echo "Nombre del scrip: $0"

contador=1
for i in $*
do
	echo "Parametro $contador : $i"
	((contador ++))
done
