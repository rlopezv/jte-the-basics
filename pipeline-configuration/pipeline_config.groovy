@merge libraries{
    sonarqube
}

application_environments{
  merge = true
  dev {
      long_name = "dev"
   }
  prod {
      long_name = "prod"
   }

}

stages{
    continuous_integration{
        build
        static_code_analysis
    }
}
