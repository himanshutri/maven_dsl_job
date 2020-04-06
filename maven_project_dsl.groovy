job('first_project_job_through_DSL') {
   description('My first job THROUGH dsl')
    scm {
        github('/himanshutri/maven_dsl_job', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('test package')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}