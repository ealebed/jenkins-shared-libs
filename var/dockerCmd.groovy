#!/usr/bin/env groovy  

def call(args) {
      assert args != null
//      return sh(script: "sudo docker ${args}", returnStdout: true)
      sh '''sudo docker ${args}'''
  }
