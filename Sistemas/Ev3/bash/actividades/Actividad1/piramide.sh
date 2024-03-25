#!/bin/bash

for (( i=1; i<=$1; i++ ));
do
	espacios=$(($1-i))

	for((j=1;j<=$espacios;j++));
	do
		echo -n " "
	done
	for (( j=1;j<=i;j++ ));
	do
	echo -n "* "
	done
	echo
done
echo
echo
for (( i=1; i<=$1; i++ ));
do
        espacios=$(($1-i))

        for((j=1;j<=$espacios;j++));
        do
                echo -n " "
        done
        for (( j=1;j<=i;j++ ));
        do
        echo -n "*"
        done
        echo
done

echo
echo

for (( i=1; i<=$1; i++ ));
do
        espacios=$(($1-i))

        for((j=1;j<=$espacios;j++));
        do
                echo -n " "
        done
	a=$((i*2-1))
        for (( j=1;j<=a;j++ ));
        do
        echo -n "*"
        done
        echo
done
