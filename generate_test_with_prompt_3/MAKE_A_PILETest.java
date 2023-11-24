    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MAKE_A_PILETest {
    @Test
    public void make_a_pileTEST() {
        ArrayList<Integer> result = MAKE_A_PILE.make_a_pile(3);
        assertEquals("[3, 5, 7]", result.toString());
    }
}