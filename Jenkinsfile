pipeline{
agent any
stages{
stage('vcs'){
  steps{
     git branch: 'main',
      url: 'https://github.com/glaxma/maven.git',
      pool: true
  }
}
stage('run'){
  steps{
    bat "mvn -Dmaven.test.failure.ignore=true clean package"
  }
}
 post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
}
}