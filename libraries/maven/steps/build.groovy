void call(app_env){
    stage("Maven: Build"){
        node {
            tools {
     gradle "gradle"
}
        println "Step Configuration: ${config}"
        println "build from the maven library tenant"
        withMaven {
            sh "mvn -v"
        }
        withGradle {
            sh "gradle -v"
        }
    }
    }
}
