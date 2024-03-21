#!/bin/bash

#el cat sirve para pasarle los datos al cut
#el cut -d separa por columnas a partir de :
#el -f1,3 coje la fila 1 y 3
# el --output-delimiter=";" sustituye lo que hay entre cada columna por ;
#el sort -t ordena por ; en fila
#el -k2 -n elije la columan 2 y la ordena
# y el > users.txt lo vuelca todo a un archivo llamado users.txt

cat /etc/passwrd | cut -d':' -f1,3 --output-delimiter=";" | sort -t';' -k2 -n > users.txt

