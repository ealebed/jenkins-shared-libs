  def call(args) {
      assert args != null
      echo "Arguments are ${args}"
//      return sh(script: "sudo docker ${args}", returnStdout: true)
      script: "sudo docker ${args}"
  }
