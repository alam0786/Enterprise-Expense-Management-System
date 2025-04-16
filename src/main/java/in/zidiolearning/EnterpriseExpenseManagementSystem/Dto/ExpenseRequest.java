package in.zidiolearning.EnterpriseExpenseManagementSystem.Dto;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ExpenseRequest {
    private String title;
    private String description;
    private BigDecimal amount;
    private String category; // Travel, Food, Office Supplies, etc.
    private LocalDate expenseDate;
    private String attachmentUrl; // S3/File path if storing files
}
