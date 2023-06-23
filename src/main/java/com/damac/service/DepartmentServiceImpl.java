package com.damac.service;

import com.damac.entity.Department;
import com.damac.repository.DepartmentRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class DepartmentServiceImpl implements DepartmentService {

    @Inject
    DepartmentRepository departmentRepository;

    @Transactional
    public void createDepartment(Department department) {
        department.setNoOfEmployees(department.getEmployees().size());
        departmentRepository.persist(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.listAll();
    }

    public Department getDepartmentWithMaxSalary() {
        return departmentRepository.find("ORDER BY totalSalary DESC").firstResult();
    }

}
