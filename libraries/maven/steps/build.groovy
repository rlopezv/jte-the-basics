void call(app_env){
    stage("Maven: Build"){
        withMaven(maven: config.mavenId) {
            String command = "mvn "
            if (!phases) {
                error "Must supply phase for Maven"
            }
            phases.each { phase -> command += "${phase} "}

            if (goals) {
                goals.each { goal -> command += "${goal} " }
            }

            if (properties) {
                properties.each { propertyName, value -> command += "-D${propertyName} "
                    if (value != null) {
                        command += "= ${value} "
                    }
                }
            }

            if (profiles) {
                command += "-P"
                String joined = profiles.join(",")
                command += joined
            }

            sh command
        }
    }
}
