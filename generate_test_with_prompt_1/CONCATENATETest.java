
package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class CONCATENATETest {
    @Test
    public void testConcatenate() {
        String[] strings = {"hello", " ", "world"};
        assertEquals("hello world", humaneval.correct.CONCATENATE.concatenate(strings));
    }
    
    @Test
    public void testConcatenateWithEmptyString() {
        String[] strings = {"hello", "", "world"};
        assertEquals("hello world", humaneval.correct.CONCATENATE.concatenate(strings));
    }
    
    @Test
    public void testConcatenateWithNullString() {
        String[] strings = {"hello", null, "world"};
        assertEquals("hello world", humaneval.correct.CONCATENATE.concatenate(strings));
    }
}
