package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MAX_ELEMENT;
import java.util.List;

public class MAX_ELEMENTTest {
    @Test
    public void max_elementTEST() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(MAX_ELEMENT.max_element(list), 3);
    }
}