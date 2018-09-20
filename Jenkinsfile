pipeline {
    agent {
        docker { image 'gradle:4.10.0-jdk-alpine' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'gradle tasks'
            }
        }
    }
}
