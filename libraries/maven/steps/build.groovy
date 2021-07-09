void call(app_env){
    stage("Maven: Build"){
        node {

        println "Step Configuration: ${config}"
        println "build from the maven library tenant"
        withMaven {
            sh "mvn -v"
        }
        withGradle ( gradle: "gradle") {
            sh "/opt/gradle/gradle-6.8/bin/gradle -v"
        }
    }
    }
}
