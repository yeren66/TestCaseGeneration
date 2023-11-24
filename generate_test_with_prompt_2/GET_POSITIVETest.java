package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class GET_POSITIVETest {
    @Test
    public void testGetPositive() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(-4);
        
        List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(numbers);
        
        assertEquals("Positive numbers not returned correctly", Arrays.asList(1, 3), result);
    }
}