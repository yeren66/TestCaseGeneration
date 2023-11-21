package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CAN_ARRANGETest {
    @Test
    void testCanArrange() {
        int[] arr = new int[] {1, 2, 4, 3, 5};
        assertEquals(3, humaneval.correct.CAN_ARRANGE.can_arrange(arr));
    }

    @Test
    void testCannotArrange() {
        int[] arr = new int[] {1, 2, 3};
        assertEquals(-1, humaneval.correct.CAN_ARRANGE.can_arrange(arr));
    }
}