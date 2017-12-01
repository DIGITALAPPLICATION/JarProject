pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        echo 'Code will be checkout'
      }
    }
    stage('build') {
      steps {
        bat 'mvn clean deploy'
      }
    }
    stage('deploy') {
      steps {
        echo 'deploy'
      }
    }
  }
}