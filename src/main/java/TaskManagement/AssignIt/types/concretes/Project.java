/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.types.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author Administrator
 */
@Data
@Entity
@Table( name = "Project")
public class Project {
    
    //Column isimlerini duzeltmeyi unutma !!!
    @Column(name = "UserId")
    private int userId;
    ;
    @Id
    @GeneratedValue
    @Column(name = "ProjectId")
    private int projectId;
    
    @Column(name = "projectName")
    private String projectName;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "projectStatus")
    private String projectStatus;
    
    @Column(name = "startDate")
    private Date startDate;
    
    @Column(name = "endDate")
    private Date endDate;
    
    public Project(int userId, int projectId, String projectName, String description, String projectStatus, Date startDate, Date endDate) {
        this.userId = userId;
        this.projectId = projectId;
        this.projectName = projectName;
        this.description = description;
        this.projectStatus = projectStatus;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    
    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the projectId
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * @param projectId the projectId to set
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the projectName
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName the projectName to set
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the projectStatus
     */
    public String getProjectStatus() {
        return projectStatus;
    }

    /**
     * @param projectStatus the projectStatus to set
     */
    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
