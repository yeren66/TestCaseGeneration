package humaneval;

import org.junit.Assert;
import org.junit.Test;

public class STRANGE_SORT_LISTTest {
    
    @Test
    public void strange_sort_listTEST() {
        List<Integer> lst = new ArrayList<Integer>();
        
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        
        List<Integer> expectedResult = new ArrayList<Integer>();
        
        expectedResult.add(1);
        expectedResult.add(4);
        expectedResult.add(2);
        expectedResult.add(3);
        
        Assert.assertEquals(expectedResult, STRANGE_SORT_LIST.strange_sort_list(lst));
    }
}