package com.finalproj.finalproject.repository;

import com.finalproj.finalproject.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {

    @Query("SELECT ur FROM UserRole ur WHERE ur.roleType=?1")
    Optional<UserRole> getRoleByRoleType(String roleType);

}
