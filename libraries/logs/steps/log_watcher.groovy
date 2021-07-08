@BeforeStep
void before(){
    println "Running before the ${hookContext.library} library's ${hookContext.step} step"
}

@AfterStep
void after(){
    println "Running after the ${hookContext.library} library's ${hookContext.step} step"
}


// @BeforeStep
// void before(context){
//   println "Splunk: running before the ${context.library} library's ${context.step} step" 
// }

// @AfterStep
// //({ config.afterSteps ? (context.step in config.afterSteps) : true })
// void after(context){
//   //println "Splunk: running after the ${context.library} library's ${context.step} step" 
//   println "_______${context}__________"
// }

// @AfterStep
// //({ currentBuild.result.toString() == "FAILURE" })
// void afterFailure(context){
//   //println "Splunk: running after the ${context.library} library's ${context.step} step failure" 
//   println "_______${context}__________"
// }