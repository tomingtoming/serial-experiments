pipeline {
    agent {
        docker { image 'gradle:4.10.0-jdk-alpine' }
    }
    stages {
        stage('Docker Build') {
            steps {
                sh 'gradle check'
            }
        }
    }
}
