package in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.expenseRepository;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.expenseService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class expenseServiceImp implements expenseService
{
	@Autowired
	private expenseRepository expenserepositroy;

	@Override
	public Expense createExpense(Expense expense) {
		
		return expenserepositroy.save(expense);
	}

	@Override
	public List<Expense> getExpenseById(User user) {
		
		return expenserepositroy.findByCreatedBy(user);
	}

	@Override
	public Expense getExpenseById(Long id) {
		
		return expenserepositroy.findById(id)
				.orElseThrow(()->
				new RuntimeException("Expense not fond"));
	}

	@Override
	public void deleteExpense(Long id) {
		expenserepositroy.deleteById(id);
		
	}

}
