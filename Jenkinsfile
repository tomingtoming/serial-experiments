pipeline {
    agent {
        docker { image 'gradle:4.10.0-jdk-alpine' }
    }
    stages {
        stage {
            steps {
                sh './gradlew tasks'
            }
        }
    }
}
