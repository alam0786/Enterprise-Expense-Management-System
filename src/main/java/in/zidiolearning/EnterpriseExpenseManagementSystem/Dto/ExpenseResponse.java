package in.zidiolearning.EnterpriseExpenseManagementSystem.Dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ExpenseResponse {
    private Long id;
    private String title;
    private String description;
    private BigDecimal amount;
    private String category;
    private LocalDate expenseDate;
    private String status; // PENDING, APPROVED, REJECTED
    private String submittedBy;
    private String attachmentUrl;
}
