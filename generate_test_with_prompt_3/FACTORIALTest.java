package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class FACTORIALTest {
    @Test
    public void factorialTEST() {
        // Test case 1: n = 0
        ArrayList<Integer> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, FACTORIAL.factorial(0));
        
        // Test case 2: n = 1
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        assertEquals(expectedResult, FACTORIAL.factorial(1));
        
        // Test case 3: n = 2
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        assertEquals(expectedResult, FACTORIAL.factorial(2));
        
        // Test case 4: n = 3
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(6);
        assertEquals(expectedResult, FACTORIAL.factorial(3));
        
        // Test case 5: n = 4
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(6);
        expectedResult.add(24);
        assertEquals(expectedResult, FACTORIAL.factorial(4));
        
        // Test case 6: n = 5
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(6);
        expectedResult.add(24);
        expectedResult.add(15);
        assertEquals(expectedResult, FACTORIAL.factorial(5));
    }
}