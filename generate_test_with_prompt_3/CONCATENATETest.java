package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CONCATENATETest {
    @Test
    public void concatenateTEST() {
        String[] strings = {"Hello", "World"};
        String expectedResult = "HelloWorld";
        
        assertEquals(expectedResult, CONCATENATE.concatenate(strings));
    }
}