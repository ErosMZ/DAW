#!/bin/bash
mes=$(date +"%m")
mesEscr=$(date +"%B")
while IFS="," read nombre titulo palabras
do

	precio=$(echo "$palabras * 0.10" | bc)
	echo "$nombre 1articulo $precio€" > /NOTICIAS/pagar-$mesEscr.txt 

done < /NOTICIAS/palabras-$mes.txt
