void call(){
    stage("Maven: Build"){
        sh 'mvn -v'
        println "build from the maven library 2"
    }
}
