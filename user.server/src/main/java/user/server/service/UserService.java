package user.server.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import user.server.entity.UserEntity;
import user.server.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;

	public UserService(UserRepository userRepo) {
		userRepository = userRepo;
	}

	public boolean checkUserData(String username, String pwd) {

		Optional<UserEntity> user = userRepository.findByUsernameAndPassword(username, pwd);

		if (user.isPresent()) {
			return true;
		} else {
			UserEntity userEntity = new UserEntity(username, pwd);
			userRepository.save(userEntity);
			return false;
		}
	}
}
