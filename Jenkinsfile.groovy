pipeline {
	agent any

	stages {
		stage('Build') {
			steps {
				echo 'Building..from develop branch'
				echo 'BranchName: ${env.BRANCH_NAME}'
			}
		}
		stage('Test') {
			steps {
				echo 'Testing..from develop branch..'
			}
		}
		stage('Deploy') {
			steps {
				echo 'Deploying...from develop branch...'
			}
		}
	}
	}
