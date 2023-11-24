  package humaneval.correct;
  
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MAKE_PALINDROME;
  
public class MAKE_PALINDROMETest {
    @Test
    public void is_palindromeTEST() {
        String testStr1 = "racecar";
        assertTrue(MAKE_PALINDROME.is_palindrome(testStr1));
        
        String testStr2 = "level";
        assertFalse(MAKE_PALINDROME.is_palindrome(testStr2));
    }
}