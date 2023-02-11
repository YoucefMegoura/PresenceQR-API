#!/bin/bash

export PGPASSWORD=presenceqr

for file in $(ls ./*.sql); do
  echo "Executing $file script ..."
  psql -U presenceqr -h localhost -f $file
  echo "--------------------------"
done
