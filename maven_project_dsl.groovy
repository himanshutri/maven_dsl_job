job('first_project_job_through_DSL') {
   description('My first job THROUGH dsl')
    scm {
        github('himanshutri/spring-web-project', 'master')
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