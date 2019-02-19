package com.finalproj.finalproject.configuration;

import com.finalproj.finalproject.model.UserRole;
import com.finalproj.finalproject.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventListners {

    @Autowired
    UserRoleRepository userRoleRepository;

    @EventListener
    public void seed(ContextRefreshedEvent event){
        try{

            List<UserRole> userRoleList = userRoleRepository.findAll();
            if(userRoleList.isEmpty() || userRoleList.size() != 3){

                userRoleRepository.deleteAll();

                UserRole userRole = new UserRole();
                userRole.setRoleType("ADMIN");

                UserRole userRole1 = new UserRole();
                userRole1.setRoleType("COMPETITOR");

                UserRole userRole2 = new UserRole();
                userRole2.setRoleType("GENERAL");

                userRole = userRoleRepository.save(userRole);
                userRole1 = userRoleRepository.save(userRole1);
                userRole2 = userRoleRepository.save(userRole2);

                System.out.println(userRole);
                System.out.println(userRole1);
                System.out.println(userRole2);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
