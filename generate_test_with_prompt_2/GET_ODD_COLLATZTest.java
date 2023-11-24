package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GET_ODD_COLLATZTest {
    @Test
    public void testGetOddCollatz() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(5);
        
        assertEquals(result, humaneval.correct.GET_ODD_COLLATZ.get_odd_collatz(5));
    }
}