package com.financemanagerapp.controller;

import com.financemanagerapp.dto.UserRequestDTO;
import com.financemanagerapp.dto.UserResponseDTO;
import com.financemanagerapp.service.IUserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final IUserService userService;
	
	public UserController(IUserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/register")
	public UserResponseDTO register(@RequestBody UserRequestDTO userRequest) {
		return userService.registerUser(userRequest);
	}
}

/*
	END-TO-END FLOW
	=> Client → Controller → Service → Repository → DB
*/
