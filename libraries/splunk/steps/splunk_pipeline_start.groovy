@Init
void call(){
    withEnv(['test=asd']){
        sh 'java -version'
    }
    println "Splunk: beginning of the pipeline!"
}

