job('first_project_job_through_DSL') {
   description('My first job THROUGH dsl')
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
    }
    triggers {
        scm()
    }
    steps {
        maven('clean build')
    }
    publishers {
        archiveArtifacts('job-dsl-plugin/build/libs/job-dsl.hpi')
    }
}