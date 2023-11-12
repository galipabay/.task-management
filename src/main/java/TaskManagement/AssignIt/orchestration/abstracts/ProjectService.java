/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.orchestration.abstracts;

import TaskManagement.AssignIt.types.concretes.Project;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ProjectService {
    List<Project> getAll();
}
