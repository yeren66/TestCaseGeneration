package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class SEARCHTest {
    @Test
    public void humaneval.correct.SEARCH.search_example1() {
        int[] lst = new int[] {4, 1, 2, 2, 3, 1};
        assertEquals(2, humaneval.correct.SEARCH.search(lst));
    }
    
    @Test
    public void humaneval.correct.SEARCH.search_example2() {
        int[] lst = new int[] {1, 2, 2, 3, 3, 3, 4, 4, 4};
        assertEquals(3, humaneval.correct.SEARCH.search(lst));
    }
    
    @Test
    public void humaneval.correct.SEARCH.search_example3() {
        int[] lst = new int[] {5, 5, 4, 4, 4};
        assertEquals(-1, humaneval.correct.SEARCH.search(lst));
    }
}
