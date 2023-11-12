/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.orchestration.concretes;

import TaskManagement.AssignIt.business.abstracts.ProjectDataAccess;
import TaskManagement.AssignIt.orchestration.abstracts.ProjectService;
import TaskManagement.AssignIt.types.concretes.Project;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class ProjectManager implements ProjectService {

    private ProjectDataAccess projectDataAccess;
    
//    @AutoWired : Spring'in arka planda buna karsilik gelecek projelerin -
//    ProjectDataAccess'in bir instance'i olabilicek bir tane sinifi uretiyor ve onu veriyor.
    @Autowired
    public ProjectManager(ProjectDataAccess projectDataAccess) {
        this.projectDataAccess = projectDataAccess;
    }

    @Override
    public List<Project> getAll() {
        return this.projectDataAccess.findAll();
    }

}
