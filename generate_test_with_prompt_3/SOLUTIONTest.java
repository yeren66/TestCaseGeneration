    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SOLUTIONTest {
    @Test
    public void solutionTEST() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(8);
        lst.add(7);
        lst.add(1);
        
        assertEquals(12, SOLUTION.solution(lst));
    }
}