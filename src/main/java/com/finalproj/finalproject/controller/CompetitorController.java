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
    private ResponseEntity getAllCompetitors(){
        return competitorService.getAllCompetitors();
    }

    @GetMapping("/getAllByDepartment/{deptId}")
    private ResponseEntity getAllCompetitorsByDepartmentId(@PathVariable("deptId") int deptId){
        return competitorService.getAllCompetitorsByDepartment(deptId);
    }

}
