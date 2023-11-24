package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class MAKE_A_PILETest {
    @Test
    public void testMakeAPileWithOneLevel() {
        ArrayList<Integer> pile = humaneval.correct.MAKE_A_PILE.make_a_pile(1);
        assertEquals(1, pile.size());
        assertEquals((int) 1, (int) pile.get(0));
    }

    @Test
    public void testMakeAPileWithTwoLevels() {
        ArrayList<Integer> pile = humaneval.correct.MAKE_A_PILE.make_a_pile(2);
        assertEquals(2, pile.size());
        assertEquals((int) 1, (int) pile.get(0));
        assertEquals((int) 3, (int) pile.get(1));
    }

    @Test
    public void testMakeAPileWithThreeLevels() {
        ArrayList<Integer> pile = humaneval.correct.MAKE_A_PILE.make_a_pile(3);
        assertEquals(3, pile.size());
        assertEquals((int) 1, (int) pile.get(0));
        assertEquals((int) 3, (int) pile.get(1));
        assertEquals((int) 5, (int) pile.get(2));
    }
}