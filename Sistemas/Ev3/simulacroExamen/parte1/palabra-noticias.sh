#!/bin/bash

CampoUnoYDos=`cut -d "$" -f4,3 /NOTICIAS/particionNoticias/noticias1.txt | tr "$" ","`
VariablePALABRAS=`cut -d "$" -f5 /NOTICIAS/particionNoticias/noticias1.txt  | wc -c`

echo -n $CampoUnoYDos >> /NOTICIAS/particionNoticias/palabras-ABRIL.txt
echo ","$VariablePALABRAS >> /NOTICIAS/particionNoticias/palabras-ABRIL.txt
