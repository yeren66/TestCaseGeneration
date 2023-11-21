package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ADD_ELEMENTSTest {
    @Test
    public void testAddElements() {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 4;
        assertEquals(24, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
    
    @Test
    public void testEmptyArray() {
        ArrayList<Integer> arr = new ArrayList<>();
        int k = 0;
        assertEquals(0, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
    
    @Test
    public void testNegativeNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-1);
        int k = 1;
        assertEquals(0, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
    
    @Test
    public void testNonNegativeNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int k = 1;
        assertEquals(1, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
    
    @Test
    public void testTwoDigitNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        int k = 1;
        assertEquals(10, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
    
    @Test
    public void testMoreThanTwoDigitNumber() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        int k = 1;
        assertEquals(0, humaneval.correct.ADD_ELEMENTS.add_elements(arr, k));
    }
}