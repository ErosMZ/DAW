#!/bin/bash
for file in /NOTICIAS/particionNoticias/noticias*.txt
do
	while IFS="$" read -r ID FECHA TITULO AUTOR TEXTO
	do
		TITULOM=$(echo "$TITULO" | tr "a-z" "A-Z")
		#TITULOM=$echo(echo "$TITULO" | tr "[:lower:]" "[:upper:]")
		echo "$ID"\$"$FECHA"\$"$TITULOM"\$"$AUTOR"\$"$TEXTO" > $file
	done < "$file"
done
