package com.resto.userService.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.boot.model.process.internal.UserTypeResolution;
import org.springframework.stereotype.Service;

import com.resto.userService.dto.UserDTO;
import com.resto.userService.entity.User;
import com.resto.userService.mapper.UserMapper;
import com.resto.userService.reposirory.UserRepository;
import com.resto.userService.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Override
	public UserDTO addUser(UserDTO userDTO) {
		System.out.println("Adding new user: {}"+ userDTO);

        User user = UserMapper.mapToEntity(userDTO);
        user = userRepository.save(user);

        return UserMapper.mapToDTO(user);
	}

	@Override
	public UserDTO fetchUserById(int id) {
		System.out.println("fetching user id: {}"+ id);
		Optional<User> opUsOptional = userRepository.findById(id);
		if(opUsOptional.isPresent())
		 {
			return UserMapper.mapToDTO(opUsOptional.get());
		}
		return null;
	}

	@Override
	public List<UserDTO> fetchUser() {
		System.out.println("fetching all users {}");
		List<User> users = userRepository.findAll();
		return users.stream().map(user -> UserMapper.mapToDTO(user)).collect(Collectors.toList());
	}

}
