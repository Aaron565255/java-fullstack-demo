pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Aaron565255/java-fullstack-demo.git'
            }
        }

        stage('Compile Java') {
            steps {
                sh 'javac Backend.java Frontend.java'
            }
        }

        stage('Run Frontend') {
            steps {
                // This runs the Java program
                sh 'java Frontend'
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
}
