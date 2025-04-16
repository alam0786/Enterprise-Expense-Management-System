package in.zidiolearning.EnterpriseExpenseManagementSystem.Utils;



public class StringUtils {

    // Check if a string is null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Capitalize first letter of a string
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Generate an abbreviation from a string
    public static String generateAbbreviation(String str) {
        StringBuilder abbreviation = new StringBuilder();
        for (String word : str.split(" ")) {
            abbreviation.append(word.charAt(0));
        }
        return abbreviation.toString().toUpperCase();
    }
}
