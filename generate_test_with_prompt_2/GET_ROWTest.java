package humaneval;
import static org.junit.Assert.*;

public class GET_ROWTest {
    @Test
    public void testGetRow() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.get(0).add(1);
        lst.get(0).add(2);
        lst.get(0).add(3);
        lst.add(new ArrayList<>());
        lst.get(1).add(4);
        lst.get(1).add(5);
        lst.get(1).add(6);

        ArrayList<Tuple> result = GET_ROW.get_row(lst, 3);

        assertEquals(2, result.size());
        assertTrue(result.contains(new humaneval.correct.GET_ROW.Tuple(0, 0)));
        assertTrue(result.contains(new humaneval.correct.GET_ROW.Tuple(1, 1)));
    }
}