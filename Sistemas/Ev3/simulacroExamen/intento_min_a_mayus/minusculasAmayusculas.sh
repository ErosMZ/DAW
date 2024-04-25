#!/bin/bash

cut -d "," -f3 /NOTICIAS/particionNoticias/noti* | tr "[:lower:]" "[:upper:]"
