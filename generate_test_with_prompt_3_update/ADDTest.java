package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ADD;

public class ADDTest {
    @Test
    public void addTEST() {
        // Test 1: Addition of two positive numbers
        int x = 2;
        int y = 3;
        int expectedOutput = 5;
        assertEquals(expectedOutput, ADD.add(x, y));

        // Test 2: Addition of two negative numbers
        x = -2;
        y = -3;
        expectedOutput = -5;
        assertEquals(expectedOutput, ADD.add(x, y));
    }
}