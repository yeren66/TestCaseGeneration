package humaneval;

import static org.junit.Assert.*;

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
