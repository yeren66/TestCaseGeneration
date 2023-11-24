
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FILE_NAME_CHECK;

public class FILE_NAME_CHECKTest {
    @Test
    public void file_name_checkTEST() {
        String[] validFileNames = {"example.txt", "example.exe", "example.dll"};
        for (String fileName : validFileNames) {
            assertEquals("Yes", FILE_NAME_CHECK.file_name_check(fileName));
        }
    }
}