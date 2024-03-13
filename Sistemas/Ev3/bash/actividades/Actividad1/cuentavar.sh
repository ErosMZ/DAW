#!/bin/bash
clear
contador=0
for numeros in $*
do
	let contador+=1
done
echo $contador


