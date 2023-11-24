package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SORT_EVEN;
import java.util.Arrays;

public class SORT_EVENTest {
    @Test
    public void sort_evenTEST() {
        int[] input = new int[] {1, 3, 5, 2, 4, 6};
        int[] expected = new int[] {2, 4, 1, 3, 5, 6};
        assertArrayEquals(expected, SORT_EVEN.sort_even(input));
    }
}