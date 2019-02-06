#!/usr/bin/env bash

cd "$(dirname "$0")"

cd book-converter

python3 converter.py ../book-structure -y

cd ..

rm -rf .guides
rm -rf code
rm -rf figs
rm -rf trinket

cp -r book-structure/generate/* ../.
cp -r book-structure/generate/.guides ../.
