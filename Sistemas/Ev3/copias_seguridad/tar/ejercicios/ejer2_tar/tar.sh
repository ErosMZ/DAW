#!/bin/bash
# Programar para el usuario carles una:
# copia de seguridad incremental de su Escritorio
# la copia hay que lanzarla cada 10 minutos entre las 18h y las 22h, todos los días del mes de
# noviembre
# la copia la dejaremos en la tercera partición del segundo disco
# el nombre de la copia tendrá el siguiente formato: increm-Escritorio-AÑO-MES-HORAMIN.tar, siendo la parte de la fecha calculada de forma automática


DIA=`date +"%Y-%m-%d-%H:%M"`
tar cv -g lista-increm.txt -f /home/carles/increm-$DIA.tar /home/carles/Escritorio


# el cron es */10 18-21 * 11 *  /home/carles/tar.sh

#he puesto 21 en vez de 22 porque si no se haría a las 22:10 22:20 etc