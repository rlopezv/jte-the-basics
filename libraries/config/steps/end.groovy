@CleanUp
void call(){
    println "End of the pipeline!"
    println "Branch -> ${pipelineConfig.currentBranch}"
    git.push()
}


