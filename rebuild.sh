#!/bin/bash

LOGFILE=/tmp/projectlibre.`date '+%Y%m%d-%H%M'`.log
export LOG_LEVEL=DEBUG
echo Cleaning old log files
for logfile in /tmp/projectlibre.*.log; do mv -v $logfile /tmp/old.`basename $logfile` ; done
echo Logging to $LOGFILE

set -x 
cd `dirname $0`
cd openproj_build/
pwd
rm -r build dist
ant  -v | tee -a $LOGFILE
cp resources/projectlibre.sh dist
set +x

for i in $(seq 72); do echo -n '#'; done; echo


echo
set -x 
projectlibre.bash $1 2>&1 | tee -a $LOGFILE
set +x


cd -
