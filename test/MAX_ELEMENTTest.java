package humaneval;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class MAX_ELEMENTTest {
    @Test
    public void testMaxElement() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(3, humaneval.correct.MAX_ELEMENT.max_element(list));
    }

    @Test
    public void testMaxElementWithEmptyList() {
        List<Integer> list = Collections.emptyList();
        assertEquals(null, humaneval.correct.MAX_ELEMENT.max_element(list));
    }

    @Test
    public void testMaxElementWithNullList() {
        List<Integer> list = null;
        assertEquals(null, humaneval.correct.MAX_ELEMENT.max_element(list));
    }
}
