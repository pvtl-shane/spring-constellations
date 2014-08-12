#!/bin/bash
echo "deleting app"
cf delete constellations -f -r
echo "cleaning app"
./gradlew clean
