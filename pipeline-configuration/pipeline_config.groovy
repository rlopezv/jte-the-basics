@merge libraries{
    config
    logs
    git
    sonarqube
}

@override application_environments{
  dev {
      long_name = "dev"
   }
  prod {
      long_name = "prod"
   }

}

@override stages{
    continuous_integration{
        build
        static_code_analysis
    }
}

@override keywords {
  logEnabled = false  
}
