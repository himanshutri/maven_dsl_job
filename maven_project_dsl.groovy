job('first_project_job_through_DSL') {
   description('My first job THROUGH dsl')
    scm {
        github('https://github.com/himanshutri/maven_dsl_job', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean build')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}