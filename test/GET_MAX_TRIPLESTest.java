package humaneval;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.GET_MAX_TRIPLES;

public class GET_MAX_TRIPLESTest {
    @Test
    public void get_max_triplesTEST() {
        int result = GET_MAX_TRIPLES.get_max_triples(5);
        assertEquals(1, result);
    }
}