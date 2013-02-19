#!/bin/bash

LOGFILE=/tmp/projectlibre.`date '+%Y%m%d-%H%M'`.log
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
echo Logging to $LOGFILE
read -p "Executer dist/projectlibre.sh?"
set -x 
[ "$REPLY" == "y" ] && dist/projectlibre.sh $1 2>&1 | tee $LOGFILE
set +x


cd /home/jlam/programmation/projets/projectlibre-jlam/
