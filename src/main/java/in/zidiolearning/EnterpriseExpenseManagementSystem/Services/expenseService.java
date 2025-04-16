package in.zidiolearning.EnterpriseExpenseManagementSystem.Services;

import java.util.List;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface expenseService
{

	Expense createExpense(Expense expense);
	
	List<Expense> getExpenseById(User user);
	
	Expense getExpenseById(Long id);
	
	void deleteExpense(Long id);
	
}
