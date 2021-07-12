@merge libraries{
    config
    logs
    sonarqube
}

steps{
    docker_test{
        stage = "Unit Test"
        image = "node:lts-alpine"
        command = "npm -v"
    }
}

@override application_environments{
  dev {
      long_name = "dev"
   }
  prod {
      long_name = "prod"
   }

}

stages{
    continuous_integration{
        docker_test
        build
        static_code_analysis
    }
}

keywords {
    logEnabled = false
}
