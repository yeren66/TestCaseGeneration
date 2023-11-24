
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CONCATENATETest {
    @Test
    public void humaneval.correct.CONCATENATE.concatenate_emptyStringArray_returnsEmptyString() {
        String[] strings = {};
        assertEquals("", humaneval.correct.CONCATENATE.concatenate(strings));
    }

    @Test
    public void humaneval.correct.CONCATENATE.concatenate_oneElementStringArray_returnsSingleString() {
        String[] strings = {"a"};
        assertEquals("a", humaneval.correct.CONCATENATE.concatenate(strings));
    }

    @Test
    public void humaneval.correct.CONCATENATE.concatenate_multipleElementStringArray_returnsConcatenatedStrings() {
        String[] strings = {"a", "b", "c"};
        assertEquals("abc", humaneval.correct.CONCATENATE.concatenate(strings));
    }
}
