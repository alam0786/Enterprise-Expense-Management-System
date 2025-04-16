package in.zidiolearning.EnterpriseExpenseManagementSystem.Services;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.AuditLog;

public interface auditLogService 
{

	AuditLog saveLog(AuditLog auditLog);
	
}
