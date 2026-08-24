package repositories;

import user.User;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> finsByUSername(String username);
}
