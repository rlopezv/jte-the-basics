jte{ 
    pipeline_template = "custom_pipeline"
}

@merge libraries{
    sonarqube
    git
}

@override application_environments{
  dev {
      long_name = "dev"
      template = "custom_pipeline"
   }
  prod {
      long_name = "prod"
      template = "custom_pipeline"
   }

}

stages{
    continuous_integration{
        build
        static_code_analysis
    }
}
