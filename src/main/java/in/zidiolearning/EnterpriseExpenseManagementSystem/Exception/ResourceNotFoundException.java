package in.zidiolearning.EnterpriseExpenseManagementSystem.Exception;

public class ResourceNotFoundException extends AppException {
    public ResourceNotFoundException(String resource, Long id) {
        super(resource + " with ID " + id + " not found.");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
