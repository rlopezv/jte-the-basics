void call(app_env){
    stage("Maven: Build"){
        println "Step Configuration: ${config}"
        println "build from the maven library tenant"
        withMaven {
            sh "mvn -v"
        }
    }
}
