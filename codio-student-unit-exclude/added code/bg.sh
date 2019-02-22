#!/bin/bash

. /etc/profile.d/codio-xserver.sh

nohup $1 $2 &> /dev/null &
nohup $3 $4 $5 $6 &> /dev/null &
