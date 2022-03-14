#!/usr/bin/env bash

#cd api-red-user
#./build-image.sh

#cd ../

#cd api-red-publication
#./build-image.sh

#cd ../

#cd api-red-comment
#./build-image.sh

#cd ../

#cd discovery-server
#./build-image.sh


#cd ../

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
