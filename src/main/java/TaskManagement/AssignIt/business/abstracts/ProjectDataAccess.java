/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TaskManagement.AssignIt.business.abstracts;

import TaskManagement.AssignIt.types.concretes.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Administrator
 */
public interface ProjectDataAccess extends JpaRepository<Project,Integer>{
    
}
