package in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.AuditLog;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.auditLogRepository;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.auditLogService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class auditLogServiceImp implements auditLogService
{
	@Autowired
	private auditLogRepository auditlogrepository;
	

	@Override
	public AuditLog saveLog(AuditLog auditLog) {
		
		return auditlogrepository.save(auditLog);
	}

	
	
}
