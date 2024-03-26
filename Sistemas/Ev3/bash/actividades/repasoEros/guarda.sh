#!/bin/bash

if [ !  -d ./seguridad  ]
then
	echo "La capeta no existe, la voy a crear"
	mkdir seguridad
fi
cp * ./seguridad/
echo archivos copiados en seguridad

