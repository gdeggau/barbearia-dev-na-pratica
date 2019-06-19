#!/bin/bash

after_deploy() {
    # nome do projeto aqui
    kubectl patch deployment basico-backend --namespace="furb" -p \
  "{\"spec\":{\"template\":{\"metadata\":{\"annotations\":{\"date\":\"`date +'%s'`\"}}}}}"
}
    