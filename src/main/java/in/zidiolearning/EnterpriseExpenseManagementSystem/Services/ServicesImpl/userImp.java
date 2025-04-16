package in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.userRepository;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.userService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class userImp implements userService
{
	@Autowired
	private userRepository userrepository;

	@Override
	public Optional<User> findByEmail(String email) {
		
		return userrepository.findByEmail(email);
	}

	@Override
	public User saveUser(User user) {
		
		return userrepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		
		return 
				userrepository.findById(id)
				.orElseThrow(()->
		new RuntimeException("User not fond"));
	}

}
