@Init
void call(){
    stage("Splunk") {
    withEnv(['test=asd']){
        
        sh 'java -version'
    }
    }
    println "Splunk: beginning of the pipeline!"
}

