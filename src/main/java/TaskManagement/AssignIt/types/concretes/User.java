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
@Table(name = "User")
public class User {
    
    private int userId;
    private String userName;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private int userType;

    public User(int userId, String userName, String name, String surname, String mail, String password, int userType) {
        this.userId = userId;
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.userType = userType;
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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userType
     */
    public int getUserType() {
        return userType;
    }

    /**
     * @param userType the userType to set
     */
    public void setUserType(int userType) {
        this.userType = userType;
    }

}
