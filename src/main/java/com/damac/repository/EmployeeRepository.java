package com.damac.repository;

import com.damac.entity.Department;
import com.damac.entity.Employee;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

    public void associateWithExistingDepartment(Long employeeId, Long departmentId) {
        Employee employee = findById(employeeId);
        Department department = getEntityManager().getReference(Department.class, departmentId);
      //  employee.setDepartment(department);
    }
}
