#!/bin/bash
#el sort separa por ","
# el -k2 sirve para seleccionar la columna 2
#el head -n 2 indica que solo coja los dos primeras lineas ya ordenadas 
sort -t',' -k2 usuarios.csv | head -n 2
