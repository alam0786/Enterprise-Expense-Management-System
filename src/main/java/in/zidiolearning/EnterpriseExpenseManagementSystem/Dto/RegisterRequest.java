package in.zidiolearning.EnterpriseExpenseManagementSystem.Dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private String role; // EMPLOYEE, MANAGER, ADMIN
}

