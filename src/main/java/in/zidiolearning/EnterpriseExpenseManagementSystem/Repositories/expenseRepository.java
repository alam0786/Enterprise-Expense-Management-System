package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface expenseRepository extends JpaRepository<Expense, Long>
{
   List<Expense> findByCreatedBy(User user);
}
