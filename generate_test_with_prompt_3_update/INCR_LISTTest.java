
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.INCR_LIST;
import java.util.ArrayList;
import java.util.List;

public class INCR_LISTTest {
    @Test
    public void incr_listTEST() {
        List<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);

        List<Integer> resultList = INCR_LIST.incr_list(testList);

        assertEquals(resultList.get(0), 2);
        assertEquals(resultList.get(1), 3);
        assertEquals(resultList.get(2), 4);
    }
}
