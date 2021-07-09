void call(app_env){
    stage("Maven: Build"){
        println "build from the maven library parent"
        node {
        withMaven {
            sh "mvn -v"
        }
 //withGradle {
 //   sh 'gradle -v'
 // }
        }
    }
}
