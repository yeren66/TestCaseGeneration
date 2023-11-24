
package humaneval;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class SORT_EVENTest {
    @Test
    public void testSortEven() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] expectedOutput = new int[] {1, 3, 5, 2, 4};
        int[] actualOutput = humaneval.correct.SORT_EVEN.sort_even(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}
