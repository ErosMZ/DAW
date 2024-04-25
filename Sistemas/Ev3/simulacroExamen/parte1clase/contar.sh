#!/bin/bash
#te saca el mes escrito
MES=$(date +%B)

while IFS="$" read -r ID FECHA TITULO AUTOR TEXTO
do
	# cueta las palabras 
	PALABRAS=$(echo $TEXTO | wc -w)
echo "$AUTOR,$TITULO,$PALABRAS" >> "palabras-$MES.txt"
#el fichero de < done es el fichero en el que le los archivos

done < "$1"
