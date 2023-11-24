
package humaneval;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class MAX_ELEMENTTest {
    @Test
    public void testMaxElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        int expected = 3;
        
        assertEquals(expected, humaneval.correct.MAX_ELEMENT.max_element(list));
    }
}
