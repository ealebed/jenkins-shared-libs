def call() {
  def Dockerfile
  sh(script:  "Dockerfile = libraryResource 'Dockerfile'")
  sh(script:  "writeFile file: 'Dockerfile', text: Dockerfile")
  sh(script:  "ls -la")
  sh(script:  "cat Dockerfile")
}
