package in.zidiolearning.EnterpriseExpenseManagementSystem.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "approval")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notification
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	
	private String message;
	
	private String type;
	
	private String status;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	
	@PrePersist
	public void onCreate() {
		this.createdAt=LocalDateTime.now();
		if(this.status==null) {
			this.status="UNREAD";
		}
	}
	
}
