package in.zidiolearning.EnterpriseExpenseManagementSystem.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.userService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class userController
{

	@Autowired
	private userService userservice;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		return ResponseEntity.ok(userservice.saveUser(user));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id)
	{
		return ResponseEntity.ok(userservice.getUserById(id));
	}
}
