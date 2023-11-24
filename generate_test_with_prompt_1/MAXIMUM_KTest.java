package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MAXIMUM_KTest {
    @Test
    public void testMaximumK() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(-4);
        arr.add(5);
        int k = 3;
        
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(-4);
        expectedResult.add(-3);
        expectedResult.add(5);
        
        assertEquals(expectedResult, humaneval.correct.MAXIMUM_K.maximum_k(arr, k));
    }
    
    @Test
    public void testMaximumKWithDuplicateElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(-4);
        arr.add(4);
        int k = 2;
        
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(4);
        
        assertEquals(expectedResult, humaneval.correct.MAXIMUM_K.maximum_k(arr, k));
    }
    
    @Test
    public void testMaximumKWithNegativeElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(-1);
        arr.add(-2);
        arr.add(1);
        int k = 1;
        
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        
        assertEquals(expectedResult, humaneval.correct.MAXIMUM_K.maximum_k(arr, k));
    }
}
