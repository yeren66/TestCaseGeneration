package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IS_NESTEDTest {
    @Test
    public void testIsNested() {
        assertTrue(IS_NESTED.is_nested("[[]]"));
        assertFalse(IS_NESTED.is_nested("[]]]]]]][[[[[]"));
        assertFalse(IS_NESTED.is_nested("[][]"));
        assertFalse(IS_NESTED.is_nested("[]"));
        assertTrue(IS_NESTED.is_nested("[[][]]"));
        assertTrue(IS_NESTED.is_nested("[[]][["));
    }
}