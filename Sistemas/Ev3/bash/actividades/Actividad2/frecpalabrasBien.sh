#!/bin/bash
#El tr " " "\n"   sustituye los espacios en blanco por un salto de linea

#los pone todos en tiras y asi poder usar el uniq

#El unic hace que no se repitan los varoes y el -c los cuenta

#el -nr cuenta de mayor a menor

tr ' ' '\n' < texto.txt | sort | uniq -c | sort -nr
