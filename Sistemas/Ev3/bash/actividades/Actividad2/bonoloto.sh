#!/bin/bash
read -p "Dime cuantas lineas quieres: " lineas

for (( i=0; i<$lineas; i++ ));
do
    echo
    for (( j=1; j<=6; j++ ));
    do
        ArrayRandoms[$j]=$(($RANDOM%50))

        for (( x=1; x<=6; x++ ));
        do
           if  [ $j -ne $x ] && [ ${ArrayRandoms[j]} -eq ${ArrayRandoms[x]} ];
            then
                ArrayRandoms[$j]=$(($RANDOM%49))
		x=-1
            fi
        done
    done
    echo "${ArrayRandoms[@]}"
done

# !/bin/bash
# read -p "Dime cuantas lineas quieres: " lineas
#
# for (( i=0; i<$lineas; i++ ));
# do
#        echo
#        for (( j=1; j<=6; j++ ));
#        do
#                ArrayRandoms[$j]=$(($RANDOM%49))
#
#                for (( x=1; x<=6; x++ ));
#                do
#                        if [ ${ArrayRandoms[$j]} -eq ${ArrayRandoms[$x]} ]
#                        then
#                                ArrayRandoms[$j]=$(($RANDOM%49))
#                                x=1
#                        fi
#                done
#        done
#        echo "${ArrayRandoms[@]}"
# done
