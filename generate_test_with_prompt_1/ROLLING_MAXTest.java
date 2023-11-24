package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ROLLING_MAXTest {
    @Test
    public void testEmptyInput() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> expectedResult = new ArrayList<>();
        
        assertEquals(expectedResult, humaneval.correct.ROLLING_MAX.rolling_max(numbers));
    }
    
    @Test
    public void testSingleElementInput() {
        List<Integer> numbers = Arrays.asList(1);
        List<Integer> expectedResult = Arrays.asList(1);
        
        assertEquals(expectedResult, humaneval.correct.ROLLING_MAX.rolling_max(numbers));
    }
    
    @Test
    public void testMultipleElementInput() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4);
        
        assertEquals(expectedResult, humaneval.correct.ROLLING_MAX.rolling_max(numbers));
    }
    
    @Test
    public void testNegativeInput() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4);
        List<Integer> expectedResult = Arrays.asList(-1, -2, -3, -4);
        
        assertEquals(expectedResult, humaneval.correct.ROLLING_MAX.rolling_max(numbers));
    }
    
    @Test
    public void testZeroInput() {
        List<Integer> numbers = Arrays.asList(0, 0, 0, 0);
        List<Integer> expectedResult = Arrays.asList(0, 0, 0, 0);
        
        assertEquals(expectedResult, humaneval.correct.ROLLING_MAX.rolling_max(numbers));
    }
}
