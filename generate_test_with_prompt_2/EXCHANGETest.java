package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class EXCHANGETest {
    @Test
    public void testExchange() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);

        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);

        assertEquals("YES", humaneval.correct.EXCHANGE.exchange(lst1, lst2));
    }
}
