#!/bin/bash

cut -d ":" -f4 /etc/passwd | sort -n | uniq -c | sort -nr
