package in.zidiolearning.EnterpriseExpenseManagementSystem.Services;

import java.util.List;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Notification;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface notificationService
{

	Notification sendNotification(Notification notification);
	
	List<Notification> getUnreadNotification(User user);
	
}
