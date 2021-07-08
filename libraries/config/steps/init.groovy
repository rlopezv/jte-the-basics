import groovy.json.JsonOutput

@Init
void call(){
    node {
        sh 'java -version'
    }
    
    conf = JsonOutput.toJson(dev)

    println "echo ${conf}"

    println "echo ${dev.long_name}"
    println "Beginning of the pipeline!"
}


