import groovy.json.JsonOutput

@Init
void call(){
    node {
        sh 'java -version'
    }

    println "echo ->${dev}"

    pipelineConfig.message = "message"
    println "echo ${pipelineConfig}"
    println "echo ${dev.long_name}"
    println "Beginning of the pipeline!"
}


