package in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Notification;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.notificationRepository;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.notificationService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class notificationServiceImp implements notificationService
{
	
	@Autowired
	private notificationRepository notificationrepository;

	@Override
	public Notification sendNotification(Notification notification) {
		
		return notificationrepository.save(notification);
	}

	@Override
	public List<Notification> getUnreadNotification(User user) {
		
		return notificationrepository.findByUserAndStatus(user, "UNREAD");
	}

}
