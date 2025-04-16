package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;

public interface userRepository extends JpaRepository<User, Long>
{
 Optional<User> findByEmail(String email);
}
