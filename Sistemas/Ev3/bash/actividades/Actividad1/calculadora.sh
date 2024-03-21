#!/bin/bash
clear
read -p "Primer número: " num1
read -p "Segundo número: " num2
read -p "Dime el operador (+, -, x, /): " operador

case $operador in
	+)
	  echo $(( $num1 + $num2  ))
	;;
	-)
          echo $(( $num1 - $num2  ))
        ;;
	/)
          echo $(( $num1 / $num2  ))
        ;;
	x)
          echo $(( $num1 * $num2  ))
        ;;
	*)
	  echo "Algún valor ha sido incorrecto"
esac
