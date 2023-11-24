package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class COUNT_NUMSTest {
    @Test
    public void testCountNumsWithNoPositiveNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(-1);
        arr.add(2);
        assertEquals(0, humaneval.correct.COUNT_NUMS.count_nums(arr));
    }

    @Test
    public void testCountNumsWithOnePositiveNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        arr.add(-2);
        arr.add(3);
        assertEquals(1, humaneval.correct.COUNT_NUMS.count_nums(arr));
    }

    @Test
    public void testCountNumsWithMultiplePositiveNumbers() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-5);
        arr.add(-4);
        arr.add(3);
        arr.add(6);
        assertEquals(2, humaneval.correct.COUNT_NUMS.count_nums(arr));
    }
}
