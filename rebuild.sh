#!/bin/bash

set -x 
cd /home/jlam/programmation/projets/projectlibre-jlam/
cd openproj_build/
pwd
rm -r build dist
ant
cp resources/projectlibre.sh dist
set +x

for i in $(seq 72); do echo -n '#'; done

echo
read -p "Executer dist/projectlibre.sh?"
[ "$REPLY" == "y" ] && dist/projectlibre.sh

cd /home/jlam/programmation/projets/projectlibre-jlam/
