@Init
void call(){
    println "Splunk: beginning of the pipeline!"
}

@BeforeStep
void before(){
    println "________________"
    println "${hookContext}"
    println "________________"
    println "Splunk: running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep
void after(){
    println "________________"
    println "${hookContext}"
    println "________________"
    println "Splunk: running after the ${hookContext.library} library's ${hookContext.step} step"
}