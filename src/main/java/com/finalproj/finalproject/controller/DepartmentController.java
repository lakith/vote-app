package com.finalproj.finalproject.controller;

import com.finalproj.finalproject.model.Department;
import com.finalproj.finalproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/department")
@CrossOrigin
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/add")
    public ResponseEntity saveDepartment(@RequestBody @Valid Department department) throws Exception {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllDepartments() throws Exception {
        return departmentService.getAllDepartments();
    }
}
