package humaneval;
import static org.junit.Assert.assertEquals;

public class TRIPLES_SUM_TO_ZEROTest {
    @Test
    public void testTriplesSumToZero() {
        int[] numbers = new int[]{1, 3, 5, 0};
        assertEquals(false, humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }

    @Test
    public void testTriplesSumToZeroWithNegativeNumbers() {
        int[] numbers = new int[]{1, 3, -2, 1};
        assertEquals(true, humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }

    @Test
    public void testTriplesSumToZeroWithNoMatchingElements() {
        int[] numbers = new int[]{1, 2, 3, 7};
        assertEquals(false, humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }

    @Test
    public void testTriplesSumToZeroWithMoreThanThreeElements() {
        int[] numbers = new int[]{2, 4, -5, 3, 9, 7};
        assertEquals(true, humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }

    @Test
    public void testTriplesSumToZeroWithOneElement() {
        int[] numbers = new int[]{1};
        assertEquals(false, humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }
}