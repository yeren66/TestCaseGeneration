package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class INTERSPERSETest {
    @Test
    public void testIntersperse() {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        int delimeter = 4;
        
        List<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(1);
        expectedResult.add(delimeter);
        expectedResult.add(2);
        expectedResult.add(delimeter);
        expectedResult.add(3);
        
        assertEquals(expectedResult, humaneval.correct.INTERSPERSE.intersperse(numbers, delimeter));
    }
}