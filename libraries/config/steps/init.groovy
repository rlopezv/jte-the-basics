import groovy.json.JsonOutput

@Init
void call(){
    node {
        sh 'java -version'
    checkout scm
    }
    println "echo ->${dev}"
    
    pipelineConfig.currentBranch = scm.branches[0].name
    println "echo ${pipelineConfig}"
    println "echo ${dev.long_name}"
    println "Beginning of the pipeline!"
}


