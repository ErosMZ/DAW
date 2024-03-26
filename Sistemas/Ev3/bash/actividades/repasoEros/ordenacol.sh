#!/bin/bash
sort  -t"," -k2 usuarios.txt | uniq -c | head -n 2 
