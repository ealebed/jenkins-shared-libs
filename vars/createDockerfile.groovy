def call() {
  sh "def Dockerfile = libraryResource 'Dockerfile'"
  sh "writeFile file: 'Dockerfile', text: Dockerfile"
  sh "ls -la"
  sh "cat Dockerfile"
}
