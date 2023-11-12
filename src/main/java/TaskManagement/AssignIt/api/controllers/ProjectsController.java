/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.api.controllers;

import TaskManagement.AssignIt.orchestration.abstracts.ProjectService;
import TaskManagement.AssignIt.types.concretes.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("api/projects")
public class ProjectsController {
    
    private ProjectService projectService;
    
    @Autowired
    public ProjectsController(ProjectService projectService) {
        this.projectService = projectService;
    }
    
    @GetMapping("/getall")
    public List<Project> GetAll(){
        return this.projectService.getAll();
    }
}