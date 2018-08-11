package com.responsive.crud.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "EMPLOYEE")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6439592482605757571L;

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "EMP_NAME")
    private String name;

    @Column(name = "EMP_SALARY")
    private long salary;

    @Column(name = "EMP_DESIGNATION")
    private String designation;

    @Column(name = "EMP_PROJECT")
    private String project;

    @Column(name = "EMP_BLOOD_GROUP")
    private String bloodGroup;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

}
