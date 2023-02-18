#!/bin/bash
source ../properties.conf
#
## @file                populateDB.sh
## @section DESCRIPTION	Populate database
#
# @author youcefmegoura
# @created 11/02/2023
#
##########################
# Start of script 'populateDB.sh' #
##########################


for file in $(ls ./*.sql); do
  echo "Executing $file script ..."
  PGPASSWORD=$DB_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_USER -f $file
  echo "--------------------------"
done
