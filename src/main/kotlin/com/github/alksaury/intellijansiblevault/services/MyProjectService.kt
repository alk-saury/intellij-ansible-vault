package com.github.alksaury.intellijansiblevault.services

import com.intellij.openapi.project.Project
import com.github.alksaury.intellijansiblevault.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
