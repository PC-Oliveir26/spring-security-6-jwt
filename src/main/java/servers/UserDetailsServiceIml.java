package servers;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import repositories.UserRepository;
import user.AuthenticatedUser;

@Service
public class UserDetailsServiceIml implements UserDetailsService{
	private final UserRepository userRepository;
	
	public UserDetailsServiceIml(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return userRepository.finsByUSername(username)
				.map(AuthenticatedUser::new)
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}

}
