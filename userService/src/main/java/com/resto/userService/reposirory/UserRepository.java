package com.resto.userService.reposirory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.resto.userService.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
