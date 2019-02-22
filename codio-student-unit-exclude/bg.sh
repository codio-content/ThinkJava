#!/bin/bash

. /etc/profile.d/codio-xserver.sh

nohup $@ &> /dev/null &