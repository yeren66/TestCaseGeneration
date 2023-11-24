package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CHANGE_BASE;

public class CHANGE_BASETest {
    @Test
    public void testChangeBase() {
        int x = 8;
        int base = 3;
        String expectedResult = "22";
        
        assertEquals(expectedResult, humaneval.correct.CHANGE_BASE.change_base(x, base));
    }
    
    @Test
    public void testChangeBaseAgain() {
        int x = 8;
        int base = 2;
        String expectedResult = "1000";
        
        assertEquals(expectedResult, humaneval.correct.CHANGE_BASE.change_base(x, base));
    }
    
    @Test
    public void testChangeBaseOneMore() {
        int x = 7;
        int base = 2;
        String expectedResult = "111";
        
        assertEquals(expectedResult, humaneval.correct.CHANGE_BASE.change_base(x, base));
    }
}