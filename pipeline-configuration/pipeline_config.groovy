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
    newman_test {
        stage = "Newman Test"
        image = "postman/newman"
        command = "run 'https://www.getpostman.com/collections/0d0350a9a89d39fb6361'"
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
        newman_test
        docker_test
        build
        static_code_analysis
    }
}

keywords {
    logEnabled = false
    feature = 'overrides'
}
