package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class FACTORIZETest {
    @Test
    public void testFactorize() {
        List<Integer> result = humaneval.correct.FACTORIZE.factorize(12);
        assertEquals(result, Arrays.asList(2, 2, 3));

        result = humaneval.correct.FACTORIZE.factorize(15);
        assertEquals(result, Arrays.asList(3, 5));

        result = humaneval.correct.FACTORIZE.factorize(90);
        assertEquals(result, Arrays.asList(2, 3, 5));
    }
}