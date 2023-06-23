package com.damac.service;

import com.damac.entity.Department;

import java.util.List;

public interface DepartmentService {

    void createDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentWithMaxSalary();


}
