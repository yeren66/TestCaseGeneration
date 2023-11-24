package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ADD_ELEMENTSTest {
    @Test
    public void testAddElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(111);
        arr.add(21);
        arr.add(3);
        arr.add(4000);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        assertEquals(24, humaneval.correct.ADD_ELEMENTS.add_elements(arr, 4));
    }
}
