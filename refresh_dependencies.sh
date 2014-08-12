#!/bin/bash
echo "clearing cache..."
rm -rf ~/.gradle/caches/*

echo "rebuilding project..."
./gradlew clean build --refresh-dependencies

