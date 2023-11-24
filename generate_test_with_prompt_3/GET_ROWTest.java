
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class GET_ROWTest {
    @Test
    public void TupleTEST() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row1 = new ArrayList<Integer>();
        ArrayList<Integer> row2 = new ArrayList<Integer>();
        
        row1.add(1);
        row1.add(2);
        row1.add(3);
        
        row2.add(4);
        row2.add(5);
        row2.add(6);
        
        lst.add(row1);
        lst.add(row2);
        
        ArrayList<Tuple> result = GET_ROW.get_row(lst, 3);
        
        assertEquals(result.size(), 1);
        assertTrue(result.contains(new Tuple(0, 0)));
    }
}