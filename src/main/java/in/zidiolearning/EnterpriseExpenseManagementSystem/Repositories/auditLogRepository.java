package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.AuditLog;

public interface auditLogRepository extends JpaRepository<AuditLog, Long>
{

	
	
}
