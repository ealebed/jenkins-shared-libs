def call() {
//  def Dockerfile
  sh "Dockerfile = libraryResource 'Dockerfile'"
  sh "writeFile file: 'Dockerfile', text: Dockerfile"
  sh "ls -la"
  sh "cat Dockerfile"
}
