#!/bin/bash

./gradlew clean assemble
docker build -t spring-batch-example .
docker-compose up
