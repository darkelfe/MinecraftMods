#!/bin/bash

rm -v $1

cd mcp/
./recompile.sh
./reobfuscate_srg.sh

cd src/minecraft/
7z a ../../../$1 assets

cd ../../reobf/minecraft
7z a ../../../$1 $2

