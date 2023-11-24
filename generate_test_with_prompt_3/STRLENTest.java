package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRLENTest {
    @Test
    public void strlenTEST() {
        String testString = "This is a test string";
        int expectedLength = 19;
        
        assertEquals(expectedLength, STRLEN.strlen(testString));
    }
}