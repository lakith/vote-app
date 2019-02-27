package com.finalproj.finalproject.controller;

import com.finalproj.finalproject.service.CompetitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Competitor")
@CrossOrigin
public class CompetitorController {

    @Autowired
    CompetitorService competitorService;

    @GetMapping("/getAll")
    public ResponseEntity getAllCompetitors(){
        return competitorService.getAllCompetitors();
    }

    @GetMapping("/getAllByDepartment/{deptId}")
    public ResponseEntity getAllCompetitorsByDepartmentId(@PathVariable("deptId") int deptId){
        return competitorService.getAllCompetitorsByDepartment(deptId);
    }

}
