/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.types.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Administrator
 */
@Data
@Entity
@Table(name = "Task")
public class Task {
    
    private int taskId;
    private int projectId;
    private int taskOwnerId;
    private int taskGivenId;
    private String taskName;
    private String description;
    private String taskStatus;

    public Task(int taskId, int projectId, int taskOwnerId, int taskGivenId, String taskName, String description, String taskStatus) {
        this.taskId = taskId;
        this.projectId = projectId;
        this.taskOwnerId = taskOwnerId;
        this.taskGivenId = taskGivenId;
        this.taskName = taskName;
        this.description = description;
        this.taskStatus = taskStatus;
    }

    /**
     * @return the taskId
     */
    public int getTaskId() {
        return taskId;
    }

    /**
     * @param taskId the taskId to set
     */
    public void setTaskId(int taskId) {
        this.taskId = taskId;
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
     * @return the taskOwnerId
     */
    public int getTaskOwnerId() {
        return taskOwnerId;
    }

    /**
     * @param taskOwnerId the taskOwnerId to set
     */
    public void setTaskOwnerId(int taskOwnerId) {
        this.taskOwnerId = taskOwnerId;
    }

    /**
     * @return the taskGivenId
     */
    public int getTaskGivenId() {
        return taskGivenId;
    }

    /**
     * @param taskGivenId the taskGivenId to set
     */
    public void setTaskGivenId(int taskGivenId) {
        this.taskGivenId = taskGivenId;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
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
     * @return the taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * @param taskStatus the taskStatus to set
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    

}
