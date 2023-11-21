    
package humaneval;

import static org.junit.Assert.*;

public class STRING_SEQUENCETest {
    
    @Test
    public void testStringSequence() {
        assertEquals("0 1 2 ", humaneval.correct.STRING_SEQUENCE.string_sequence(3));
        assertEquals("0 1 ", humaneval.correct.STRING_SEQUENCE.string_sequence(1));
        assertEquals("0 ", humaneval.correct.STRING_SEQUENCE.string_sequence(0));
    }
}