package com.finalproj.finalproject.service;

import org.springframework.http.ResponseEntity;

public interface CompetitorService {

    ResponseEntity<?> getAllCompetitors();

    ResponseEntity<?> getAllCompetitorsByDepartment(int departmentId);
}
