package in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.Role;

public interface roleRepository extends JpaRepository<Role, Long>
{
	Optional<Role> findByName(String name);
}
