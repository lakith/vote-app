package com.finalproj.finalproject.service.impl;

import com.finalproj.finalproject.model.Department;
import com.finalproj.finalproject.repository.DepartmentRepository;
import com.finalproj.finalproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public ResponseEntity<?> saveDepartment(Department department) throws Exception {

        try {
            department =  departmentRepository.save(department);
            return new ResponseEntity<>(department, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public ResponseEntity<?> getAllDepartments() throws Exception {
        try{
            List<Department> departmentList = departmentRepository.findAll();
            if(departmentList.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(departmentList,HttpStatus.OK);
            }

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
