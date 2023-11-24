package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ADDTest {
    @Test
    void testAdd() {
        assertEquals(5, humaneval.correct.ADD.add(2, 3));
        assertEquals(12, humaneval.correct.ADD.add(5, 7));
    }
}
