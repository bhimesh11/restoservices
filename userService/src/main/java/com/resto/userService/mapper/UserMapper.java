package com.resto.userService.mapper;
import com.resto.userService.dto.UserDTO;
import com.resto.userService.entity.User;


public class UserMapper {
	


	
	    // Convert DTO to Entity
	    public static User mapToEntity(UserDTO userDTO) {
	        if (userDTO == null) {
	            return null;
	        }
	        User user = new User();
	        user.setUserId(userDTO.getUserId());
	        user.setUserName(userDTO.getUserName());
	        user.setUserPassword(userDTO.getUserPassword());
	        user.setAddress(userDTO.getAddress());
	        user.setCity(userDTO.getCity());
	        return user;
	    }

	    // Convert Entity to DTO
	    public static UserDTO mapToDTO(User user) {
	        if (user == null) {
	            return null;
	        }
	        UserDTO userDTO = new UserDTO();
	        userDTO.setUserId(user.getUserId());
	        userDTO.setUserName(user.getUserName());
	        userDTO.setUserPassword(user.getUserPassword());
	        userDTO.setAddress(user.getAddress());
	        userDTO.setCity(user.getCity());
	        return userDTO;

}
}
