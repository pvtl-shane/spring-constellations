#!/bin/bash

echo "building"
./gradlew clean build

echo "pushing"
cf push
