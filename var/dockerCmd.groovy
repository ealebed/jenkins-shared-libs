#!/usr/bin/env groovy  

def call(args) {
      assert args != null
      echo "Arguments are ${args}"
//      return sh(script: "sudo docker ${args}", returnStdout: true)
      return (sh '''sudo docker ${args}''', returnStdout: true)
  }
