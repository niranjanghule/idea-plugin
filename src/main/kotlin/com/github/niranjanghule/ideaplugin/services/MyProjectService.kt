package com.github.niranjanghule.ideaplugin.services

import com.github.niranjanghule.ideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
