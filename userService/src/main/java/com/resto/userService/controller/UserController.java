package com.resto.userService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.resto.userService.dto.UserDTO;
import com.resto.userService.service.UserService;

import lombok.AllArgsConstructor;
import java.util.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/users")
public class UserController {

	private UserService userService;

	@PostMapping("/addUser")
	public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
		UserDTO dto = userService.addUser(userDTO);
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}

	@GetMapping("/fetchUser/{id}")
	public ResponseEntity<UserDTO> fetchUserById(@PathVariable int id) {
		UserDTO dto = userService.fetchUserById(id);
		if (dto != null) {
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/fetchUser")
	public ResponseEntity<List<UserDTO>> fetchUsers() {
		List<UserDTO> dto = userService.fetchUser();

		if (!dto.isEmpty()) {
			return new ResponseEntity<>(dto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(dto, HttpStatus.NOT_FOUND);
		}
	}
}
