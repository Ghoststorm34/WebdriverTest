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
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }
        stage('Build') { 
            steps { 
                echo 'this is a minimal pipeline.' 
            }
        }
        
    }
}
