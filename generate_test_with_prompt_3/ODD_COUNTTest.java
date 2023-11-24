
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ODD_COUNTTest {
    @Test
    public void odd_countTEST() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("1234567");
        ArrayList<String> result = ODD_COUNT.odd_count(lst);
        assertEquals(1, result.size());
        assertEquals("the number of odd elements 4n the str4ng 4 of the 4nput.", result.get(0));
    }
}
