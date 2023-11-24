package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ADD_ELEMENTS;
import java.util.ArrayList;

public class ADD_ELEMENTSTest {
    @Test
    public void add_elementsTEST() {
        // Given a non-empty array of integers arr and an integer k, return the sum of the elements with at most two digits from the first k elements of arr.
        int[] arr = {111, 21, 3, 4000, 5, 6, 7, 8, 9};
        int k = 4;

        // When add_elements is called with arr and k
        int result = ADD_ELEMENTS.add_elements(new ArrayList<Integer>(Arrays.asList(arr)), k);

        // Then the sum of the elements with at most two digits should be returned
        assertEquals(24, result);
    }
}