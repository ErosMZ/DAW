#!/bin/bash
for i in `echo $PATH | tr ":" " "`
do
	if [ -x $i/$1  ]; then
		echo localizado en $i
		whatis $1
#		man -f $1
	fi
done
