package humaneval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FILTER_INTEGERSTest {
    @Test
    void humaneval.correct.FILTER_INTEGERS.filter_integers() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add("Hello");
        values.add(2);

        List<Integer> result = humaneval.correct.FILTER_INTEGERS.filter_integers(values);

        assertEquals(2, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
    }
}