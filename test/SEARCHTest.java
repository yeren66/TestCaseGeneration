
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SEARCH;

public class SEARCHTest {
    @Test
    public void searchTEST() {
        int[] lst = new int[]{4, 1, 2, 2, 3, 1};
        assertEquals(2, SEARCH.search(lst));
        
        lst = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4};
        assertEquals(3, SEARCH.search(lst));
        
        lst = new int[]{5, 5, 4, 4, 4};
        assertEquals(-1, SEARCH.search(lst));
    }
}
