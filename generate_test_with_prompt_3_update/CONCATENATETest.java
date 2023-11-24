package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CONCATENATE;

public class CONCATENATETest {
    @Test
    public void concatenateTEST() {
        String[] strings = {"hello", "world"};
        String result = CONCATENATE.concatenate(strings);
        assertEquals("helloworld", result);
    }
}