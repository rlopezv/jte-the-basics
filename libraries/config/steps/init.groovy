@Init
void call(){
    node {
        sh 'java -version'
    }

    println "echo ${dev.long_name}"
    println "Beginning of the pipeline!"
}


