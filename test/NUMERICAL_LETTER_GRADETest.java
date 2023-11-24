
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.NUMERICAL_LETTER_GRADE;

public class NUMERICAL_LETTER_GRADETest {
    @Test
    public void numerical_letter_gradeTEST() {
        double[] grades = new double[]{4.0, 3.0, 1.7, 2.0, 3.5};
        String[] expectedGrades = new String[]{"A+", "B-", "C-", "D+", "A-"};
        assertArrayEquals(expectedGrades, NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
}
