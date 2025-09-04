pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/Aaron565255/java-fullstack-demo.git'
            }
        }

        stage('Compile Java Files') {
            steps {
                bat 'javac Backend.java Frontend.java'
            }
        }

        stage('Run Frontend') {
            steps {
                // Run the Java program (non-interactive output for Jenkins logs)
                bat 'java Frontend'
            }
        }

        stage('Publish HTML Report') {
            steps {
                publishHTML(target: [
                    allowMissing: false,
                    alwaysLinkToLastBuild: true,
                    keepAll: true,
                    reportDir: '.',
                    reportFiles: 'index.html',
                    reportName: 'Java Online Store'
                ])
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
    }
}
