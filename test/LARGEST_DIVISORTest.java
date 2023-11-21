package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class LARGEST_DIVISORTest {
    @Test
    public void testLargestDivisor() {
        int[] inputs = new int[]{10, 20, 30, 40};
        int[] expectedOutputs = new int[]{5, 10, 15, 20};

        for (int i = 0; i < inputs.length; i++) {
            assertEquals(expectedOutputs[i], LARGEST_DIVISOR.largestDivisor(inputs[i]));
        }
    }
}