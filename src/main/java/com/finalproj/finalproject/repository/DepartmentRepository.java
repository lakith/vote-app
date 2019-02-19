package com.finalproj.finalproject.repository;

import com.finalproj.finalproject.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department,Integer> {
}
