package com.damac.controller;

import com.damac.entity.Department;
import com.damac.service.DepartmentService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/departments")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DepartmentResource {

    @Inject
    DepartmentService departmentService;

    @POST
    public Response createDepartment(Department department) {

        departmentService.createDepartment(department);

        return Response.status(Response.Status.CREATED)
                .entity("Employee created and associated with an existing department")
                .build();
    }
    @GET
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GET
    @Path("/max-salary")
    public Department getDepartmentWithMaxSalary() {
        return departmentService.getDepartmentWithMaxSalary();
    }
}