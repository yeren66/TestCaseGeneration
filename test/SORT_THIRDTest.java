package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SORT_THIRDTest {
    @Test
    public void testSortThird() {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        
        humaneval.correct.SORT_THIRD.sort_third(l);
        
        assertEquals(1, (int) l.get(0));
        assertEquals(3, (int) l.get(1));
        assertEquals(2, (int) l.get(2));
        assertEquals(4, (int) l.get(3));
        assertEquals(6, (int) l.get(4));
    }
    
    @Test
    public void testSortThirdEmptyList() {
        List<Integer> l = new ArrayList<>();
        
        humaneval.correct.SORT_THIRD.sort_third(l);
        
        assertEquals(0, l.size());
    }
}
