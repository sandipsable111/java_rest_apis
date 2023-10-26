package com.tp.vikas.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tp.vikas.demo.entity.User;
import com.tp.vikas.demo.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "user")
@Api(value="user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@ApiOperation(value = "register user",response = User.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "user Successfully registered"),
            @ApiResponse(code = 400, message = "Bad Request, request provided is not valid"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
	@PostMapping(value = "/")
	public User create(@Valid @RequestBody User user) {
		return userService.save(user);
	}

}
