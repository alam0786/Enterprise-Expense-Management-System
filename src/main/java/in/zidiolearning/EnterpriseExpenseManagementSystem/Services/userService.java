package in.zidiolearning.EnterpriseExpenseManagementSystem.Services;

import java.util.Optional;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface userService
{

	Optional<User> findByEmail(String email);
	
	User saveUser(User user);
	User getUserById(Long id);
	
}
