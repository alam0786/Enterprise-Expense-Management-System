package in.zidiolearning.EnterpriseExpenseManagementSystem.Services;

import java.util.List;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Approval;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;

public interface approvalService
{

	List<Approval> getApprovalByExpense(Expense expnse);
	
	Approval approvalExpense(Approval approval);
	
}
