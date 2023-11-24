
package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class INTERSPERSETest extends TestCase {
    public void testEmptyList() {
        List<Integer> input = new ArrayList<>();
        List<Integer> expectedOutput = new ArrayList<>();
        
        assertEquals(expectedOutput, humaneval.correct.INTERSPERSE.intersperse(input, 0));
    }
    
    public void testSingleElementList() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        
        assertEquals(expectedOutput, humaneval.correct.INTERSPERSE.intersperse(input, 0));
    }
    
    public void testMultipleElementsList() {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(0);
        expectedOutput.add(2);
        expectedOutput.add(0);
        expectedOutput.add(3);
        
        assertEquals(expectedOutput, humaneval.correct.INTERSPERSE.intersperse(input, 0));
    }
}
