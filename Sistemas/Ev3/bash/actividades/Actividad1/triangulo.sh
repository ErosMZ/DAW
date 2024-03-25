#!/bin/bash
clear
read -p "Dime las filas que quieres: " filas
for (( i=1; i<=filas; i++  ))
do
	echo
	for (( a=1; a<=i; a++ ))
	do
		echo -n  "* "
	done
done
echo
echo
for (( i=1; i<=filas; i++  ))
do
        echo
        for (( a=1; a<=i; a++ ))
        do
                echo -n  "$i "
        done
done

echo
echo

for (( i=filas; i>=1; i--  ))
do
	echo
	for (( j=1; j<=i; j++ ))
	do
	echo -n  "* "
	done
done
echo
echo

for (( i=filas; i>=1; i--  ))
do
        echo
        for (( j=1; j<=i; j++ ))
        do
        echo -n  "$i "
        done
done
echo
