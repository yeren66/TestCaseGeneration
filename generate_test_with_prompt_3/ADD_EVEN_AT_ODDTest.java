package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class ADD_EVEN_AT_ODDTest {
    @Test
    public void add_even_at_oddTEST() {
        int[] lst = new int[] {4, 2, 6, 7};
        assertEquals(2, ADD_EVEN_AT_ODD.add_even_at_odd(lst));
    }
}