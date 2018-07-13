  def call(args) {
      assert args != null
      echo "Arguments are ${args}"
//      return sh(script: "sudo docker ${args}", returnStdout: true)
      sh(script: "sudo docker ${args}")
  }
