package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class GET_ROWTest {
    @Test
    public void testGetRow() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>()); // add an empty list to the outer list
        assertEquals("Should return an empty array if no match is found", 0, GET_ROW.get_row(lst, 1).size());
    }

    @Test
    public void testGetRowWithMatch() {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>()); // add an empty list to the outer list
        lst.get(0).add(1); // add a single element to the inner list
        assertEquals("Should return the correct row index and column index", 1, GET_ROW.get_row(lst, 1).size());
    }
}