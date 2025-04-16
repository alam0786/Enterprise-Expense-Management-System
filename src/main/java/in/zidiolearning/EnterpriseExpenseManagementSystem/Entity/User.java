package in.zidiolearning.EnterpriseExpenseManagementSystem.Entity;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Name;
	
	@Column(unique = true,nullable = false)
	private String email;
	
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="role_id")
	private Role role;
	
	@Column(name = "oauth_provider")
	private String oauthProvider;
	
	@Column(name = "created_at")
	private LocalDateTime CreatedAt;
	
	
	@PrePersist
	public void onCreate() {
		this.CreatedAt=LocalDateTime.now();
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getOauthProvider() {
		return oauthProvider;
	}


	public void setOauthProvider(String oauthProvider) {
		this.oauthProvider = oauthProvider;
	}


	public LocalDateTime getCreatedAt() {
		return CreatedAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		CreatedAt = createdAt;
	}
	
	
	
	
}
