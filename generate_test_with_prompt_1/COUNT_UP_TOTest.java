package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class COUNT_UP_TOTest {
    @Test
    public void testCountUpTo() {
        List<Integer> primes = humaneval.correct.COUNT_UP_TO.count_up_to(5);
        assertEquals(2, primes.size());
        assertTrue(primes.containsAll(Arrays.asList(2, 3)));
    }
    
    @Test
    public void testCountUpToEmpty() {
        List<Integer> primes = humaneval.correct.COUNT_UP_TO.count_up_to(0);
        assertTrue(primes.isEmpty());
    }
    
    @Test
    public void testCountUpToSmallNumber() {
        List<Integer> primes = humaneval.correct.COUNT_UP_TO.count_up_to(20);
        assertEquals(8, primes.size());
        assertTrue(primes.containsAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)));
    }
    
    @Test
    public void testCountUpToSingleNumber() {
        List<Integer> primes = humaneval.correct.COUNT_UP_TO.count_up_to(1);
        assertTrue(primes.isEmpty());
    }
}