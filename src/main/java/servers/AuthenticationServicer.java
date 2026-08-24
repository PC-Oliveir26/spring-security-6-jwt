package servers;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationServicer {

	public String authentication() {
		return "token";
	}
}
