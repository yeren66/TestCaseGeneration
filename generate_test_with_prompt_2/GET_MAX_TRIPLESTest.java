package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class GET_MAX_TRIPLESTest {
    @Test
    public void testGetMaxTriples() {
        int n = 5;
        int expected = 1;
        
        int result = humaneval.correct.GET_MAX_TRIPLES.get_max_triples(n);
        
        assertEquals(expected, result);
    }
}