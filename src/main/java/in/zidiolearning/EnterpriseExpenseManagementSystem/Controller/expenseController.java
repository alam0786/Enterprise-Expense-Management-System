package in.zidiolearning.EnterpriseExpenseManagementSystem.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.expenseService;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.userService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class expenseController
{

	@Autowired
	private expenseService expenseservice;
	
	@Autowired
	private userService userservice;
	
	@PostMapping
	public ResponseEntity<Expense> creatExpense(@RequestBody Expense expense,Principal principal)
	{
		
		return ResponseEntity.ok(expenseservice.createExpense(expense));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Expense> getMyExpense(@PathVariable("id") Long id)
	{
		
		return ResponseEntity.ok(expenseservice.getExpenseById(id));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteExpense(@PathVariable("id") Long id){
		expenseservice.deleteExpense(id);
		return ResponseEntity.noContent().build();
	}
	
}
