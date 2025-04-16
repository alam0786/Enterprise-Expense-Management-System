package in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Approval;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Expense;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.approvalRepository;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.approvalService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class approvalServiceImp implements approvalService
{

	@Autowired
	private approvalRepository approvalrepository;
	
	@Override
	public List<Approval> getApprovalByExpense(Expense expnse) {
		
		return approvalrepository.findByExpense(expnse); 
	}

	@Override
	public Approval approvalExpense(Approval approval) {

		return approvalrepository.save(approval);
	}

	
	
}
