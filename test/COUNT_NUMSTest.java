package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.COUNT_NUMS;
import java.util.ArrayList;

public class COUNT_NUMSTest {
    @Test
    public void count_numsTEST() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(3);
        arr.add(-4);
        arr.add(5);
        int expectedCount = 3; // 1, 3, and 5 are positive numbers
        COUNT_NUMS cn = new COUNT_NUMS();
        assertEquals(expectedCount, cn.count_nums(arr));
    }
}