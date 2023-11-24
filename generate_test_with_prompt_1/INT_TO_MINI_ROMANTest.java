package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class INT_TO_MINI_ROMANTest {
    @Test
    public void testIntToMiniRoman_ValidInputs() {
        assertEquals("xix", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(19));
        assertEquals("clii", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(152));
        assertEquals("cdxxvi", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(426));
    }
    
    @Test
    public void testIntToMiniRoman_BoundaryInputs() {
        assertEquals("I", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(1));
        assertEquals("XCIX", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(99));
        assertEquals("CDXLII", humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(452));
    }
    
    @Test
    public void testIntToMiniRoman_InvalidInputs() {
        // Negative numbers should be rejected
        try {
            humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(-1);
            fail("Negative number should have been rejected");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
        
        // Numbers greater than 1000 should be rejected
        try {
            humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(1001);
            fail("Number greater than 1000 should have been rejected");
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}
