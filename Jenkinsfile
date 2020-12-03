pipeline { 
    agent any 
    tools{
        maven 'Maven 3.6.3.'
        jdk 'JDK9'
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Echo') { 
            steps { 
                echo 'this is a minimal pipeline.' 
            }
        }
            stage ('Build') {
            steps {
                sh 'mvn clean test' 
            }
            post {
                success {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
    }
}
