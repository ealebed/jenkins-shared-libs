def call() {
  def file = libraryResource 'Dockerfile'
  writeFile file: 'Dockerfile', text: file
  sh(script:  "ls -la")
  sh(script:  "cat Dockerfile")
}
