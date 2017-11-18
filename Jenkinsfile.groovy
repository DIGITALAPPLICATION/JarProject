pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo 'Building..'
				bat(/"D:\Hari\softwares\apache-maven-3.3.9\bin\mvn" clean package/)
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