#!/bin/bash

fecha=$(date +"%Y-%m-%d-%H")

tar cvf /tmp/backup-carles-$fecha.tar /tmp/passwd /home/eros/Escritorio
