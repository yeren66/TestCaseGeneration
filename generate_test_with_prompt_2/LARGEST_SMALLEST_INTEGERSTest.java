package humaneval;
import static org.junit.Assert.*;

public class LARGEST_SMALLEST_INTEGERSTest {
    @Test
    public void testEmptyList() {
        int[] result = humaneval.correct.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{});
        assertArrayEquals(result, new int[]{0, 0});
    }

    @Test
    public void testSingleElementList() {
        int[] result = humaneval.correct.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{1});
        assertArrayEquals(result, new int[]{0, 1});
    }

    @Test
    public void testListWithOnlyNegativeIntegers() {
        int[] result = humaneval.correct.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{-2, -4, -1, -3});
        assertArrayEquals(result, new int[]{-1, 0});
    }

    @Test
    public void testListWithOnlyPositiveIntegers() {
        int[] result = humaneval.correct.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{2, 4, 1, 3});
        assertArrayEquals(result, new int[]{0, 1});
    }

    @Test
    public void testListWithBothNegativeAndPositiveIntegers() {
        int[] result = humaneval.correct.LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{-2, -4, -1, 2, 3});
        assertArrayEquals(result, new int[]{-1, 1});
    }
}