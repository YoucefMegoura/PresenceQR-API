#!/bin/bash
source ../properties.conf

#
## @file                createDB.sh
## @section DESCRIPTION	Creation database
#
# @author youcefmegoura
# @created 11/02/2023
#


##########################
# Start of script 'createDB' #
##########################


echo -e "\x1b[1;32m[S] ################################################# Creation DATABASE               \e[0m"
echo -e "\x1b[1;32m[S] ################################################# USER DATABASE : $DB_USER        \e[0m"
echo -e "\x1b[1;32m[S] ################################################# NAME DATABASE : $DB_NAME        \e[0m"
echo -e "\x1b[1;32m[S] ################################################# HOST DATABASE : $DB_HOST        \e[0m"
echo -e "\x1b[1;32m[S] ################################################# PORT DATABASE : $DB_PORT        \e[0m"

PGPASSWORD=$DB_SYSTEM_PASSWORD psql -h $DB_HOST -p $DB_PORT -U $DB_SYSTEM_USER \
          -f createDB.sql -v DB_USER=$DB_USER -v DB_DROP="'$DB_NAME'" \
          -v DB_PASSWORD="'$DB_PASSWORD'" -v DB_NAME=$DB_NAME \
          


echo -e "\x1b[1;32m[S] ################################################# Creation DATABASE FINISH         \e[0m"
