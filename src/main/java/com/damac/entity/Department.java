package com.damac.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Department  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;

    private String name;

    private int totalSalary;


    private int noOfEmployees;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;

    public Department() {
    }

    public Department(Long departmentId, String name, int totalSalary, int noOfEmployees, List<Employee> employees) {
        this.departmentId = departmentId;
        this.name = name;
        this.totalSalary = totalSalary;
        this.noOfEmployees = noOfEmployees;
        this.employees = employees;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }

    public int getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}