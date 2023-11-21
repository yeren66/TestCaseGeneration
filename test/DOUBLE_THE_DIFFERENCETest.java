package humaneval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DOUBLE_THE_DIFFERENCETests {
    @Test
    void testEmptyList() {
        double[] lst = {};
        Assertions.assertEquals(0, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }

    @Test
    void testPositiveOddNumbers() {
        double[] lst = {1, 3, 2};
        Assertions.assertEquals(10, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }

    @Test
    void testNegativeOddNumbers() {
        double[] lst = {-1, -3, 2};
        Assertions.assertEquals(0, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }

    @Test
    void testNegativeEvenNumbers() {
        double[] lst = {-1, -3, 2};
        Assertions.assertEquals(0, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }

    @Test
    void testPositiveAndNegativeNumbers() {
        double[] lst = {-1, -3, 2};
        Assertions.assertEquals(-50, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }
}