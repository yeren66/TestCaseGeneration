package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MAXIMUM_K;
import java.util.ArrayList;
import java.util.Collections;

public class MAXIMUM_KTest {
    @Test
    public void maximum_kTEST() {
        // Test case 1: empty array and k=0
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;
        ArrayList<Integer> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, MAXIMUM_K.maximum_k(arr, k));
        
        // Test case 2: array with positive and negative numbers and k=3
        arr = new ArrayList<>();
        arr.add(-1);
        arr.add(2);
        arr.add(4);
        arr.add(-7);
        arr.add(5);
        arr.add(-9);
        k = 3;
        expectedResult = new ArrayList<>();
        expectedResult.add(-1);
        expectedResult.add(2);
        expectedResult.add(4);
        assertEquals(expectedResult, MAXIMUM_K.maximum_k(arr, k));
        
        // Test case 3: array with all positive numbers and k=5
        arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(7);
        arr.add(9);
        k = 5;
        expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(7);
        expectedResult.add(9);
        assertEquals(expectedResult, MAXIMUM_K.maximum_k(arr, k));
    }
}