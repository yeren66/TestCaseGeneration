package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class IS_NESTEDTest {
    @Test
    public void is_nestedTEST() {
        assertTrue(IS_NESTED.is_nested("[[]]"));
        assertFalse(IS_NESTED.is_nested("[]]]]]]][[[[[]"));
        assertFalse(IS_NESTED.is_nested("[][]"));
        assertFalse(IS_NESTED.is_nested("[]"));
        assertTrue(IS_NESTED.is_nested("[[][]]"));
        assertTrue(IS_NESTED.is_nested("[[]][["));
    }
}