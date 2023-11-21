package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FIND_CLOSEST_ELEMENTSTest {
    @Test
    public void testFindClosestElements() {
        double[] numbers = new double[] {1, 2, 3};
        double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers);
        assertEquals(result[0], 2.0, 0.0001); // The closest pair of elements is (2, 3)
        assertEquals(result[1], 3.0, 0.0001);
    }
}