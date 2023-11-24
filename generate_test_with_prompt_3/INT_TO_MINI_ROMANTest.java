package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class INT_TO_MINI_ROMANTest {
    @Test
    public void int_to_mini_romanTEST() {
        assertEquals("xix", INT_TO_MINI_ROMAN.int_to_mini_roman(19));
        assertEquals("clii", INT_TO_MINI_ROMAN.int_to_mini_roman(152));
        assertEquals("cdxxvi", INT_TO_MINI_ROMAN.int_to_mini_roman(426));
    }
}