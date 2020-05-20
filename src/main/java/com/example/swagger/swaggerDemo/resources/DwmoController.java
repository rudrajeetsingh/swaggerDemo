package com.example.swagger.swaggerDemo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/demo")
@Api(value="Demo Controller", description="Testing Class")
public class DwmoController {
	@ApiOperation(value="Hello World")
	@ApiResponses(value={
			@ApiResponse(code=100, message="Data not passed properly"),
			@ApiResponse(code=200, message="Success (Y)")
	})
	@GetMapping("/getData")
	public String getData() {
		return "Hello World";
	}
	@PostMapping("/postData")
	public String postData(@RequestBody final String value) {
		return value;
	}
}
