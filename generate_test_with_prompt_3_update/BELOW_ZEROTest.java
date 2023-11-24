package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.BELOW_ZERO;
import java.util.List;

public class BELOW_ZEROTest {
    @Test
    public void below_zeroTEST() {
        List<Integer> operations = Arrays.asList(1, 2, -3);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }
}