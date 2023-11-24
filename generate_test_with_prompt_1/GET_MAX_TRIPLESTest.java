package humaneval;

import static org.junit.Assert.*;

public class GET_MAX_TRIPLESTest {
    @Test
    public void testGetMaxTriples() {
        int n = 5;
        assertEquals(1, humaneval.correct.GET_MAX_TRIPLES.get_max_triples(n));
        
        n = 3;
        assertEquals(0, humaneval.correct.GET_MAX_TRIPLES.get_max_triples(n));
    }
}