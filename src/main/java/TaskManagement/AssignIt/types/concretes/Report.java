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
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author Administrator
 */
@Data
@Entity
@Table(name = "Report")
public class Report {
    
    @Id
    @GeneratedValue
    @Column
    private int reportId;
    private String reportName;
    private String reportContent;
    private String reportDescription;
    private int userId;
    private Date creationDate;
    
    public Report(int reportId, String reportName, String reportContent, String reportDescription, int userId, Date creationDate) {
        this.reportId = reportId;
        this.reportName = reportName;
        this.reportContent = reportContent;
        this.reportDescription = reportDescription;
        this.userId = userId;
        this.creationDate = creationDate;
    }
    
    /**
     * @return the reportId
     */
    public int getReportId() {
        return reportId;
    }

    /**
     * @param reportId the reportId to set
     */
    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    /**
     * @return the reportName
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * @param reportName the reportName to set
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * @return the reportContent
     */
    public String getReportContent() {
        return reportContent;
    }

    /**
     * @param reportContent the reportContent to set
     */
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    /**
     * @return the reportDescription
     */
    public String getReportDescription() {
        return reportDescription;
    }

    /**
     * @param reportDescription the reportDescription to set
     */
    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription;
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
     * @return the creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * @param creationDate the creationDate to set
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
