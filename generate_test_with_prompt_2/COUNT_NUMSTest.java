package humaneval;

import org.junit.Test;
import java.util.ArrayList;

public class COUNT_NUMSTest {
    @Test
    public void testCountNums() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(-4);
        
        int expected = 2; // Since there are two positive numbers in the array: 1 and 3
        int actual = humaneval.correct.COUNT_NUMS.count_nums(arr);
        
        assertEquals(expected, actual);
    }
}