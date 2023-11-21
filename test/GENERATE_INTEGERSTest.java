package humaneval;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class GENERATE_INTEGERSTest {
    
    @Test
    void testGenerateIntegers() {
        // Test case 1: a and b are both even numbers
        int a = 2;
        int b = 8;
        ArrayList<Integer> expectedResult = new ArrayList<>();
        for (int i = 2; i <= 8; i += 2) {
            expectedResult.add(i);
        }
        assertEquals(expectedResult, humaneval.correct.GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 2: a and b are both odd numbers
        a = 1;
        b = 9;
        expectedResult = new ArrayList<>();
        for (int i = 2; i <= 8; i += 2) {
            expectedResult.add(i);
        }
        assertEquals(expectedResult, humaneval.correct.GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 3: a and b are both even numbers but in descending order
        a = 8;
        b = 2;
        expectedResult = new ArrayList<>();
        for (int i = 2; i <= 8; i += 2) {
            expectedResult.add(i);
        }
        assertEquals(expectedResult, humaneval.correct.GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 4: a and b are both odd numbers but in descending order
        a = 9;
        b = 1;
        expectedResult = new ArrayList<>();
        for (int i = 2; i <= 8; i += 2) {
            expectedResult.add(i);
        }
        assertEquals(expectedResult, humaneval.correct.GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 5: a and b are not both even or odd numbers
        a = 3;
        b = 7;
        expectedResult = new ArrayList<>();
        assertEquals(expectedResult, humaneval.correct.GENERATE_INTEGERS.generate_integers(a, b));
    }
}