
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class REVERSE_DELETETest {
    @Test
    public void testReverseDelete() {
        String s = "abcde";
        String c = "ae";
        ArrayList<Object> expectedResult = new ArrayList<>();
        expectedResult.add("bcd");
        expectedResult.add(false);
        
        ArrayList<Object> actualResult = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testReverseDelete2() {
        String s = "abcdef";
        String c = "b";
        ArrayList<Object> expectedResult = new ArrayList<>();
        expectedResult.add("acdef");
        expectedResult.add(false);
        
        ArrayList<Object> actualResult = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testReverseDelete3() {
        String s = "abcdedcba";
        String c = "ab";
        ArrayList<Object> expectedResult = new ArrayList<>();
        expectedResult.add("cdedc");
        expectedResult.add(true);
        
        ArrayList<Object> actualResult = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expectedResult, actualResult);
    }
}
