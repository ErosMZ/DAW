#!/bin/bash

a=`cut -d "," -f3 /NOTICIAS/particionNoticias/palabras-ABRIL.txt`
b=2
c=`cut -d "," -f2 /NOTICIAS/particionNoticias/palabras-ABRIL.txt | tr "," " "`
let resultado=$a*$b


echo $c $a "palabras" $resultado"€" >> /NOTICIAS/particionNoticias/pagar-ABRIL.txt
