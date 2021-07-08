import groovy.json.JsonOutput

@Init
void call(){
    node {
        sh 'java -version'
    }
    
    def conf = dev

    conf.each { println "Code: $it.key = Value: $it.value" }

    println "echo ${dev.long_name}"
    println "Beginning of the pipeline!"
}


