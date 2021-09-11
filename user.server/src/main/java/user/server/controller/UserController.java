package user.server.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import user.server.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "/verify")
	public ResponseEntity<String> verifyUserDetails(@RequestParam(name = "user", required = true) String username,
			@RequestParam(name = "pwd") String pwd) {

		if (userService.checkUserData(username, pwd)) {
			return ResponseEntity.ok("successfully logged in");
		}
		return new ResponseEntity<String>("User is saved", HttpStatus.CREATED);
	}

	@GetMapping(path = "/name")
	public String getName() {
		return "SUCESSFULLY IN REST";
	}
}
