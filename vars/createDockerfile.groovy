#!/usr/bin/env groovy

def call() {
  def Dockerfile = libraryResource 'Dockerfile'
  writeFile file: 'Dockerfile', text: Dockerfile
  sh(script: "ls -la")
  sh(script: "cat Dockerfile")
}
