package com.resto.userService.service;

import java.util.List;

import com.resto.userService.dto.UserDTO;

public interface UserService {

	UserDTO addUser(UserDTO userDTO);

	UserDTO fetchUserById(int id);

	List<UserDTO> fetchUser();

}
