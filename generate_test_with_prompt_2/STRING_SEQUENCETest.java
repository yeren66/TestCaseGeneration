package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class STRING_SEQUENCETest {
    @Test
    public void testStringSequence() {
        String result = humaneval.correct.STRING_SEQUENCE.string_sequence(3);
        assertEquals("0 1 2 ", result);
    }
}