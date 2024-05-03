#!/usr/bin/env groovy

def call() {
    echo "building the application for branch ${env.BRANCH_NAME}"
    sh 'mvn clean package'
}
