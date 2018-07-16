def call() {
  def file = libraryResource 'Dockerfile'
  writeFile file: 'Dockerfile', text: file
}
