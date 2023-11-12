/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TaskManagement.AssignIt.types.concretes;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author Administrator
 */
@Data
@Entity
@Table(name = "Task")
public class Time {

    private int userId;
    private int projectId;
    private Date startDate;
    private Date endDate;
    private Time timeSpan;

    public Time(int userId, int projectId, Date startDate, Date endDate, Time timeSpan) {
        this.userId = userId;
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeSpan = timeSpan;
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

    /**
     * @return the timeSpan
     */
    public Time getTimeSpan() {
        return timeSpan;
    }

    /**
     * @param timeSpan the timeSpan to set
     */
    public void setTimeSpan(Time timeSpan) {
        this.timeSpan = timeSpan;
    }

}
