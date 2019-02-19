package com.finalproj.finalproject.service;

import com.finalproj.finalproject.dto.CompetitorDTO;
import com.finalproj.finalproject.dto.LoginDTO;
import com.finalproj.finalproject.dto.UserDTO;
import com.finalproj.finalproject.model.VoteDTO;
import org.springframework.http.ResponseEntity;

import java.security.Principal;

public interface UserService {

    ResponseEntity<?> saveNewUser(UserDTO userDTO) throws Exception;

    ResponseEntity<?> userLogin(LoginDTO loginDTO);

    ResponseEntity<?> activateAUser(int userId);

    ResponseEntity<?> saveCompetitor(CompetitorDTO userDTO) throws Exception;

    ResponseEntity<?> saveVote(VoteDTO voteDTO, Principal principal);

    ResponseEntity<?> getAllUsers();

}
