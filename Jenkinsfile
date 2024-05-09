pipeline {
    agent any // Use any available agent on the Jenkins instance

    stages {
        stage('Build') { // Defines a stage named 'Build'
            steps {
                // This step runs a shell command to build the project
                sh 'mvn clean package'
            }
        }
        stage('Test') { // Defines a stage named 'Test'
            steps {
                // This step runs a shell command to run tests
                sh 'mvn test'
            }
        }
        stage('Deploy') { // Defines a stage named 'Deploy'
            steps {
                // This step runs a shell command to deploy the application
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}

