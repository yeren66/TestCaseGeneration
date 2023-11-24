package humaneval;

import static org.junit.jupiter.api.Assertions.*;

public class IS_BOREDTest {
    
    @Test
    public void testIsBored() {
        String input = "Hello world";
        int expectedResult = 0;
        
        assertEquals(expectedResult, humaneval.correct.IS_BORED.is_bored(input));
    }
}