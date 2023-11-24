
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.TOTAL_MATCH;
import java.util.List;

public class TOTAL_MATCHTest {
    @Test
    public void total_matchTEST() {
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();
        
        assertEquals(lst1, TOTAL_MATCH.total_match(lst1, lst2));
        assertEquals(lst1, TOTAL_MATCH.total_match(new ArrayList<>(), new ArrayList<>()));
    }
}