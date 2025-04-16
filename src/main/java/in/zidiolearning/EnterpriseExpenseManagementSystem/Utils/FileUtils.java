package in.zidiolearning.EnterpriseExpenseManagementSystem.Utils;

import java.io.File;
import java.io.IOException;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {

    // Save file to the server
    public static String saveFile(MultipartFile file, String targetDir) throws IOException {
        File targetFile = new File(targetDir, file.getOriginalFilename());
        file.transferTo(targetFile);
        return targetFile.getAbsolutePath();
    }

    // Read file content (useful for validation or displaying)
    public static String readFile(File file) throws IOException {
        return FileUtils.readFileToString(file, "UTF-8");
    }

    private static String readFileToString(File file, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	// Delete a file
    public static boolean deleteFile(File file) {
        return file.delete();
    }
}
