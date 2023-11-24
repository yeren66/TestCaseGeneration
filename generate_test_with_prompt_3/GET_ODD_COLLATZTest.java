package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class GET_ODD_COLLATZTest {
    @Test
    public void get_odd_collatzTEST() {
        // Test case 1: input = 5, expected output = [1, 5]
        ArrayList<Integer> result = GET_ODD_COLLATZ.get_odd_collatz(5);
        assertEquals(result.size(), 2);
        assertTrue(result.contains(1));
        assertTrue(result.contains(5));

        // Test case 2: input = 7, expected output = [1, 7]
        result = GET_ODD_COLLATZ.get_odd_collatz(7);
        assertEquals(result.size(), 2);
        assertTrue(result.contains(1));
        assertTrue(result.contains(7));
    }
}