package com.finalproj.finalproject.service;

import com.finalproj.finalproject.model.Department;
import org.springframework.http.ResponseEntity;

public interface DepartmentService {

    ResponseEntity<?> saveDepartment(Department department) throws Exception;

    public ResponseEntity<?> getAllDepartments() throws Exception;

}
