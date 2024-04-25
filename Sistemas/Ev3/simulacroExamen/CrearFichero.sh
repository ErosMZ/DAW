#!/bin/bash

read -p "Dime el id: " id
read -p "Dime la fecha: " fecha
read -p "Dime el título: " titulo
read -p "Dime el autor: " autor
read -p "Dime el texto: " texto

echo -n "$"$id"$"  >> prueba.txt
echo -n $fecha"$" >> prueba.txt
echo -n $titulo"$" >> prueba.txt
echo -n $autor"$" >> prueba.txt
echo -n $texto"$" >> prueba.txt
echo >> prueba.txt
