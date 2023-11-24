package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class DERIVATIVETest {
    @Test
    public void derivativeTEST() {
        List<Integer> xs = new ArrayList<>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);
        
        List<Integer> result = DERIVATIVE.derivative(xs);
        assertEquals(result, new ArrayList<Integer>() {{ add(1); add(4); add(12); add(20); }});
    }
}