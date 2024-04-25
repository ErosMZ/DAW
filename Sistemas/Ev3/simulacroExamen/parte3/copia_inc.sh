#!/bin/bash
dia=$(date +"%d-%m-%Y")
tar cv -g ./lista-incre.txt -f /BACKUPS/noticias-$dia.tar $HOME/Descargas
