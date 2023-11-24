package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class FILE_NAME_CHECKTest {
    @Test
    public void testValidFileNames() {
        assertEquals("Yes", humaneval.correct.FILE_NAME_CHECK.file_name_check("example.txt"));
        assertEquals("Yes", humaneval.correct.FILE_NAME_CHECK.file_name_check("example.exe"));
        assertEquals("Yes", humaneval.correct.FILE_NAME_CHECK.file_name_check("example.dll"));
    }

    @Test
    public void testInvalidFileNames() {
        assertEquals("No", humaneval.correct.FILE_NAME_CHECK.file_name_check("1example.txt"));
        assertEquals("No", humaneval.correct.FILE_NAME_CHECK.file_name_check("example01.exe"));
        assertEquals("No", humaneval.correct.FILE_NAME_CHECK.file_name_check("example02.dll"));
    }
}