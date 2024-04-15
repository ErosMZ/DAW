#/bin/bash
clear

read -p "Ruta del archivo: " ruta
read -p "Alumnos para premiar: " num

archivo=$ruta

	cat $archivo | tail -n +2 | sort -rt ";" -k6 | head -n$num | cut -d ";" -f2,3,4 | tr ";" " " > FP_2024-2025.txt
	cat FP_2024-2025.txt
