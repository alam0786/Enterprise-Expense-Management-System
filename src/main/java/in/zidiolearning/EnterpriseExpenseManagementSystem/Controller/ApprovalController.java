package in.zidiolearning.EnterpriseExpenseManagementSystem.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import in.zidiolearning.EnterpriseExpenseManagementSystem.Dto.ApprovalRequest;
import in.zidiolearning.EnterpriseExpenseManagementSystem.Services.ServicesImpl.approvalServiceImp;

@RestController
@RequestMapping("/api/approvals")
@RequiredArgsConstructor
public class ApprovalController {

    private final approvalServiceImp approvalService;

    @PostMapping("/{expenseId}/approve")
    public ResponseEntity<String> approveExpense(@PathVariable Long expenseId, @RequestBody ApprovalRequest request) {
        approvalService.approveExpense(expenseId, request);
        return ResponseEntity.ok("Expense approved successfully");
    }

    @PostMapping("/{expenseId}/reject")
    public ResponseEntity<String> rejectExpense(@PathVariable Long expenseId, @RequestBody ApprovalRequest request) {
        approvalService.rejectExpense(expenseId, request);
        return ResponseEntity.ok("Expense rejected");
    }
}
