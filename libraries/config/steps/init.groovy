@Init
void call(){
    node {
        sh 'java -version'
    }
    println "Beginning of the pipeline!"
}


