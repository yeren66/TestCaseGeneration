package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECIMAL_TO_BINARYTest {
    @Test
    public void testDecimalToBinary() {
        int decimal = 15;
        String expectedResult = "db1111db";
        assertEquals(expectedResult, humaneval.correct.DECIMAL_TO_BINARY.decimal_to_binary(decimal));
        
        decimal = 32;
        expectedResult = "db100000db";
        assertEquals(expectedResult, humaneval.correct.DECIMAL_TO_BINARY.decimal_to_binary(decimal));
    }
}