
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class FILE_NAME_CHECKTest {
    @Test
    public void file_name_checkTEST() {
        // Test case 1: "example.txt" should return Yes
        assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.txt"));

        // Test case 2: "1example.dll" should return No (the name should start with a latin alphapet letter)
        assertEquals("No", FILE_NAME_CHECK.file_name_check("1example.dll"));

        // Test case 3: "exa.txt" should return Yes (There should not be more than three digits ('0'-'9') in the file's name)
        assertEquals("Yes", FILE_NAME_CHECK.file_name_check("exa.txt"));

        // Test case 4: "example.exe" should return Yes (The substring after the dot should be one of these: ['txt', 'exe', 'dll'])
        assertEquals("Yes", FILE_NAME_CHECK.file_name_check("example.exe"));
    }
}