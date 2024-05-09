pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Your build steps here
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Your test steps here
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Your deployment steps here
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
