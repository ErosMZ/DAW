#!/bin/bash
contador=0
for numeros in $*
do
	let Media+=$numeros
	let contador+=1
done
let Media/=$contador
echo $Media
