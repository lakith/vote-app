package com.finalproj.finalproject.service.impl;

import com.finalproj.finalproject.model.Competitors;
import com.finalproj.finalproject.repository.CompetitorsRepository;
import com.finalproj.finalproject.service.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CompetitorsServiceImpl implements CompetitorService {

    @Autowired
    CompetitorsRepository competitorsRepository;


    @Override
    public ResponseEntity<?> getAllCompetitors() {
        List<Competitors> competitorsList = competitorsRepository.findAll();
        if(competitorsList.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(competitorsList,HttpStatus.OK);
        }
    }

    @Override
    public ResponseEntity<?> getAllCompetitorsByDepartment(int departmentId) {
        List<Competitors> competitorsList = competitorsRepository.getCompetitorsByDepartmentId(departmentId);
        if(competitorsList.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(competitorsList,HttpStatus.OK);
        }
    }
}
