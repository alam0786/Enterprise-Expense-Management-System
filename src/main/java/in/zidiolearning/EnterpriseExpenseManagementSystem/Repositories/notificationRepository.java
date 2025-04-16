package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Notification;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface notificationRepository extends JpaRepository<Notification, Long>
{

	List<Notification> findByUserAndStatus(User user,String status);
	
}
