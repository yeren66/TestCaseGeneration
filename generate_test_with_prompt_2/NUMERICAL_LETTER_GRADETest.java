package humaneval;
import org.junit.Assert;
import org.junit.Test;

public class NUMERICAL_LETTER_GRADETest {
    @Test
    public void testNumericalLetterGrade() {
        double[] grades = new double[] {4.0, 3, 1.7, 2, 3.5};
        String[] expectedOutput = new String[] {"A+", "B", "C-", "C", "A-"};
        
        Assert.assertArrayEquals(expectedOutput, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
}