void call(app_env){
    stage("Maven: Build"){
        node {
        withMaven (maven: 'm3') {
            sh "mvn clean verify"
        }
        }
        println app_env
        println "build from the maven library"
    }
}
