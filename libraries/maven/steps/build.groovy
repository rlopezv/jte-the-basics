void call(app_env){
    stage("Maven: Build"){
        node {
        println "Step Configuration: ${config}"
        println "build from the maven library tenant"
        withMaven {
            sh "mvn -v"
        }
    }
    }
}
