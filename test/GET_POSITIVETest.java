package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class GET_POSITIVETest {
    @Test
    public void testGetPositive() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);

        List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(numbers);

        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertFalse(result.contains(-2));
    }
}