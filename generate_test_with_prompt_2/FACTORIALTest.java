package humaneval;
import static org.junit.Assert.*;

public class FACTORIALTest {
    @Test
    public void testFactorial() {
        // Test case 1: n = 0
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, humaneval.correct.FACTORIAL.factorial(0));
        
        // Test case 2: n = 5
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        assertEquals(expected, humaneval.correct.FACTORIAL.factorial(5));
        
        // Test case 3: n = 10
        expected.clear();
        for (int i = 1; i <= 10; i++) {
            if ((i % 2) == 0) {
                int x = 1;
                for (int j = 1; j <= i; j++) x *= j;
                expected.add(x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) x += j;
                expected.add(x);
            }
        }
        assertEquals(expected, humaneval.correct.FACTORIAL.factorial(10));
    }
}