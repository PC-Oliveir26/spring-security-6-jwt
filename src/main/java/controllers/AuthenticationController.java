package controllers;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import servers.AuthenticationServicer;

@RestController
public class AuthenticationController {

	private final AuthenticationServicer authenticationService;
	
	public AuthenticationController(AuthenticationServicer authenticationService) {
		this.authenticationService = authenticationService;
	}
	
	@PostMapping("authenticate")
	public String authenticate(Authentication authentication) {
		return authenticationService.authentication(authentication);
	}
}
