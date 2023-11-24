package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class STRANGE_SORT_LISTTest {
    @Test
    public void strange_sort_listTEST() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(4);
        expectedResult.add(2);
        expectedResult.add(3);
        
        assertEquals(STRANGE_SORT_LIST.strange_sort_list(lst), expectedResult);
    }
}