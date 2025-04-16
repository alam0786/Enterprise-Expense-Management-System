package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Approval;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;

public interface approvalRepository extends JpaRepository<Approval, Long>
{

	List<Approval> findByExpense(Expense expnse);

	

}
