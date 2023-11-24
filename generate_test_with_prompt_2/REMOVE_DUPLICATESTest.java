package humaneval;

import org.junit.Test;

import static org.junit.Assert.*;

public class REMOVE_DUPLICATESTest {
    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        
        assertEquals(expected, humaneval.correct.REMOVE_DUPLICATES.remove_duplicates(numbers));
    }
}