package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class REMOVE_DUPLICATESTest {
    
    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = humaneval.correct.REMOVE_DUPLICATES.remove_duplicates(numbers);
        
        assertEquals(result, Arrays.asList(1, 2, 3, 4, 5));
    }
    
    @Test
    public void testRemoveDuplicatesWithDuplicates() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 6);
        List<Integer> result = humaneval.correct.REMOVE_DUPLICATES.remove_duplicates(numbers);
        
        assertEquals(result, Arrays.asList(1, 2, 3, 4, 5, 6));
    }
    
    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = humaneval.correct.REMOVE_DUPLICATES.remove_duplicates(numbers);
        
        assertEquals(result, new ArrayList<>());
    }
}
