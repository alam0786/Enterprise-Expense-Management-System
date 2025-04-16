package in.zidiolearning.EnterpriseExpenseManagementSystem.Configuration;


import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Entity.User;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Repositories.userRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final userRepository userrepository;

    @Autowired
    public CustomUserDetailsService(userRepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userrepository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));

        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),
                user.getPassword(),
                Collections.singletonList(user.getRole())
        );
    }
}

