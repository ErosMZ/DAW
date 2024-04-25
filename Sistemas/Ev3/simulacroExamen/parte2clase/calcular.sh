#!/bin/bash

while IFS="," read autor _ palabras
do
	pago=$(echo "$palabras * 0.10 | bc")
	echo "$autor,$palabras,$pago" >> pagar-$(date +%B).txt
#el fichero de < done es el fichero en el que le los archivos
done < palabras-$(date +%B).txt

#-nr la n representa los numeros y la r lo ordena de mayor a menor
# el -o es lo mismo que >
sort -t "," -k3 -nr pagar-$(date +%B).txt -o pagar-$pagar-$(date +%B).txt
