pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './quickstart/gradlew assemble -p quickstart'
                archiveArtifacts 'quickstart/build/libs/quickstart.war'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh './quickstart/gradlew test -p quickstart'
                junit 'quickstart/build/test-results/test/*.xml'
                archiveArtifacts 'quickstart/build/reports/tests/test/*'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}