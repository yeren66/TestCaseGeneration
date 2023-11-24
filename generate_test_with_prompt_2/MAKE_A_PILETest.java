package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class MAKE_A_PILETest {
    @Test
    public void testMakeAPile() {
        MAKE_A_PILE pile = new MAKE_A_PILE();
        
        assertEquals(3, pile.make_a_pile(3).size());
        assertEquals(5, pile.make_a_pile(3).get(0));
        assertEquals(7, pile.make_a_pile(3).get(1));
        
        assertEquals(4, pile.make_a_pile(4).size());
        assertEquals(6, pile.make_a_pile(4).get(0));
        assertEquals(8, pile.make_a_pile(4).get(1));
        
        assertEquals(5, pile.make_a_pile(5).size());
        assertEquals(7, pile.make_a_pile(5).get(0));
        assertEquals(9, pile.make_a_pile(5).get(1));
    }
}