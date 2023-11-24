package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class GET_POSITIVETest {
    @Test
    public void get_positiveTEST() {
        // Create an input list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(0);

        // Call the method and check that only positive numbers are returned
        List<Integer> result = GET_POSITIVE.get_positive(numbers);
        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertFalse(result.contains(-2));
    }
}