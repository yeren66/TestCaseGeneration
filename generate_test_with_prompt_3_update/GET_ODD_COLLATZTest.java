
package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;

public class GET_ODD_COLLATZTest {
    @Test
    public void get_odd_collatzTEST() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(5);
        assertEquals("[1, 5]", GET_ODD_COLLATZ.get_odd_collatz(5).toString());
    }
}
