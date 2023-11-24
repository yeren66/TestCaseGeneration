package humaneval;
import static org.junit.Assert.*;

public class FILE_NAME_CHECKTest {
    @Test
    public void testFile_name_check() {
        String validFileName = "example.txt";
        assertEquals("Yes", humaneval.correct.FILE_NAME_CHECK.file_name_check(validFileName));
        
        String invalidFileName1 = "1example.dll";
        assertEquals("No", humaneval.correct.FILE_NAME_CHECK.file_name_check(invalidFileName1));
        
        String invalidFileName2 = "example.exe";
        assertEquals("Yes", humaneval.correct.FILE_NAME_CHECK.file_name_check(invalidFileName2));
    }
}