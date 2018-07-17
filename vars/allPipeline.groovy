def call(body) {
    def pipelineParams= [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = pipelineParams
    body()

    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Get Dockerfile') {
                steps {
                		script {
			                  def tmpFile = libraryResource 'Dockerfile'
			                  writeFile file: 'Dockerfile', text: tmpFile
                  			    sh '''
                    				ls -la
                    				cat Dockerfile
                  		  	    '''
                		}
                }
            }
            stage('Build') {
                steps {
                		script {
					sh '''
		                     docker version
		                     docker build -t ealebed/hn:1.0.313 .
		                     docker image ls
				    '''
                    }
                }
            }
        }
    }
}
