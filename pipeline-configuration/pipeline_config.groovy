@merge libraries{
    config
    logs
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

stages{
    continuous_integration{
        build
        static_code_analysis
    }
}

ketywords {
    
}
