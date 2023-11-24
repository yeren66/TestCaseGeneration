
package humaneval;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ROLLING_MAXTest {
    @Test
    public void testRollingMax() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        List<Integer> result = humaneval.correct.ROLLING_MAX.rolling_max(numbers);

        assertEquals(result, new ArrayList<>());
    }
}
