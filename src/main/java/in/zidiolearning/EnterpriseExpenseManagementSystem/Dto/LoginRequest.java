package in.zidiolearning.EnterpriseExpenseManagementSystem.Dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
