package humaneval;
import static org.junit.Assert.*;

public class IS_BOREDTest {
    @Test
    public void testIsBored() {
        String input = "Hello world";
        int result = humaneval.correct.IS_BORED.is_bored(input);
        assertEquals(0, result);
    }
}