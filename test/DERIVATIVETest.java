
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.DERIVATIVE;
import java.util.ArrayList;
import java.util.List;

public class DERIVATIVETest {
    @Test
    public void derivativeTEST() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);
        
        List<Integer> result = DERIVATIVE.derivative(xs);
        assertEquals(result, new ArrayList<Integer>(Arrays.asList(1, 4, 12, 20)));
    }
}