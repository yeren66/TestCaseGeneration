package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class FACTORIALTest {
    
    @Test
    void humaneval.correct.FACTORIAL.factorial_returnsCorrectResultForEvenInput() {
        int n = 5;
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                int x = 1;
                for (int j = 1; j <= i; j++) {
                    x *= j;
                }
                expected.add(x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
                expected.add(x);
            }
        }
        
        assertEquals(expected, humaneval.correct.FACTORIAL.factorial(n));
    }
    
    @Test
    void humaneval.correct.FACTORIAL.factorial_returnsCorrectResultForOddInput() {
        int n = 5;
        ArrayList<Integer> expected = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((i % 2) == 0) {
                int x = 1;
                for (int j = 1; j <= i; j++) {
                    x *= j;
                }
                expected.add(x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
                expected.add(x);
            }
        }
        
        assertEquals(expected, humaneval.correct.FACTORIAL.factorial(n));
    }
}