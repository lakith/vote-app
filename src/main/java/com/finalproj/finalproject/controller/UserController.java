package com.finalproj.finalproject.controller;

import com.finalproj.finalproject.dto.CompetitorDTO;
import com.finalproj.finalproject.dto.LoginDTO;
import com.finalproj.finalproject.dto.UserDTO;
import com.finalproj.finalproject.model.VoteDTO;
import com.finalproj.finalproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@RestController
@RequestMapping("/staffUser")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public ResponseEntity testFirst() {
        String name = "I am lakith Muthugala";
        return new ResponseEntity(name, HttpStatus.OK);
    }

    @PostMapping("/addNewUser")
    public ResponseEntity saveNewUser(@RequestBody @Valid UserDTO userDTO, Principal principal) throws Exception {
        return userService.saveNewUser(userDTO);
    }

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody @Valid LoginDTO loginDTO) {
        return userService.userLogin(loginDTO);
    }



    @PostMapping(path = "/saveCompetitor")
    public ResponseEntity saveCompetitors(@RequestBody @Valid CompetitorDTO competitorDTO) throws Exception {
        return  userService.saveCompetitor(competitorDTO);
    }

    @PostMapping(path = "/saveVote")
    public ResponseEntity saveVote(@RequestBody @Valid VoteDTO voteDTO,Principal principal) throws Exception {
        return  userService.saveVote(voteDTO,principal);
       // return new ResponseEntity(principal.getName(),HttpStatus.OK);
    }

    @GetMapping(path = "/getAllUsers")
    public ResponseEntity getAllUsers(){
        return userService.getAllUsers();
    }

}
