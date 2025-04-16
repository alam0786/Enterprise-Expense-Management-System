package in.zidiolearning.EnterpriseExpenseManagementSystem.Configuration;

import com.enterprise.expensemgmt.entity.Role;
import com.enterprise.expensemgmt.entity.User;
import com.enterprise.expensemgmt.repository.RoleRepository;
import com.enterprise.expensemgmt.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.userinfo.*;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OAuth2UserServiceImpl implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    @Transactional
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
        OAuth2UserService<OAuth2UserRequest, OAuth2User> delegate = new DefaultOAuth2UserService();
        OAuth2User oAuth2User = delegate.loadUser(userRequest);

        Map<String, Object> attributes = oAuth2User.getAttributes();
        ClientRegistration clientRegistration = userRequest.getClientRegistration();
        String registrationId = clientRegistration.getRegistrationId();

        String email = extractEmail(registrationId, attributes);
        String name = extractName(registrationId, attributes);

        Optional<User> userOptional = userRepository.findByEmail(email);
        User user;
        if (userOptional.isEmpty()) {
            Role defaultRole = roleRepository.findByName("EMPLOYEE").orElseThrow();
            user = new User();
            user.setEmail(email);
            user.setName(name);
            user.setRole(defaultRole);
            user.setPassword("OAUTH2_USER"); // optional placeholder
            userRepository.save(user);
        }

        return oAuth2User;
    }

    private String extractEmail(String provider, Map<String, Object> attributes) {
        if (provider.equals("google")) {
            return (String) attributes.get("email");
        } else if (provider.equals("github")) {
            return (String) attributes.get("email");
        }
        throw new IllegalArgumentException("Unsupported OAuth2 provider: " + provider);
    }

    private String extractName(String provider, Map<String, Object> attributes) {
        if (provider.equals("google")) {
            return (String) attributes.get("name");
        } else if (provider.equals("github")) {
            return (String) attributes.get("login");
        }
        return "OAuth2 User";
    }
}

