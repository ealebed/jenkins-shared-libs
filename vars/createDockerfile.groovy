#!/usr/bin/env groovy

def call() {
  echo "Hello!"
  sh(script: "def Dockerfile = libraryResource 'Dockerfile'")
  sh(script: "writeFile file: 'Dockerfile', text: Dockerfile")
  sh(script: "ls -la")
  sh(script: "cat Dockerfile")
}
