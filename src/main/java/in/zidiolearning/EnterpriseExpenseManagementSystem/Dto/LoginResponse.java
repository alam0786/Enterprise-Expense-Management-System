package in.zidiolearning.EnterpriseExpenseManagementSystem.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginResponse {
    private String token;
    private String role;
    private String email;
}
