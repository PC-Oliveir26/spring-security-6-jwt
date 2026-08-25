package servers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServicer {
	
	private final JwtService jwtService;
	
	public AuthenticationServicer ( JwtService jwtService ) {
		this.jwtService = jwtService;
	}

	public String authentication(Authentication authentication) {
		return jwtService.generateToken(authentication);
	}
}
