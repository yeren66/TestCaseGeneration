package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class FACTORIZETest {
    @Test
    public void testFactorize_PositiveNumber() {
        int n = 24;
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);

        assertEquals(expectedResult, humaneval.correct.FACTORIZE.factorize(n));
    }

    @Test
    public void testFactorize_NegativeNumber() {
        int n = -1;
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(-1);

        assertEquals(expectedResult, humaneval.correct.FACTORIZE.factorize(n));
    }

    @Test
    public void testFactorize_Zero() {
        int n = 0;
        List<Integer> expectedResult = new ArrayList<>();

        assertEquals(expectedResult, humaneval.correct.FACTORIZE.factorize(n));
    }

    @Test
    public void testFactorize_One() {
        int n = 1;
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);

        assertEquals(expectedResult, humaneval.correct.FACTORIZE.factorize(n));
    }

    @Test
    public void testFactorize_PrimeNumber() {
        int n = 3;
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);

        assertEquals(expectedResult, humaneval.correct.FACTORIZE.factorize(n));
    }
}