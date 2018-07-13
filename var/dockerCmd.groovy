#!/usr/bin/env groovy  

def call(args) {
      assert args != null
      sh '''echo ${args}'''
      sh '''ls -al'''
//      return sh(script: "sudo docker ${args}", returnStdout: true)
      sh '''sudo docker ${args}'''
  }
