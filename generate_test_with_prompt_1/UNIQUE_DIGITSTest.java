package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;

public class UNIQUE_DIGITSTest {
    @Test
    public void testUniqueDigits() {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(15);
        x.add(33);
        x.add(1422);
        x.add(1);
        ArrayList<Integer> res = UNIQUE_DIGITS.uniqueDigits(x);
        assertEquals(res, new ArrayList<>());
    }
}
