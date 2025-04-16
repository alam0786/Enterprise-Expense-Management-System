package in.zidiolearning.EnterpriseExpenseManagementSystem.Utils;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {

    // Method to create a successful response
    public static ResponseEntity<Object> createSuccessResponse(Object data) {
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

    // Method to create an error response
    public static ResponseEntity<Object> createErrorResponse(String message, HttpStatus status) {
        return new ResponseEntity<>(new ApiResponse(false, message), status);
    }

    // Nested class to represent a generic API response
    public static class ApiResponse {
        private boolean success;
        private String message;

        public ApiResponse(boolean success, String message) {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
