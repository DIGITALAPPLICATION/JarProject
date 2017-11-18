pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo 'Building..'
				bat(/"D:\DevOps\maven\apache-maven-3.5.2-bin\apache-maven-3.5.2\bin" clean package/)
			}
		}
		stage('Test') {
			steps {
				echo 'Testing..'
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying....'
			}
		}
	}
	}