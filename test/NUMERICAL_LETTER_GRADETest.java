package humaneval;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class NUMERICAL_LETTER_GRADETest {
    @Test
    public void testAPlus() {
        double[] grades = new double[] {4.0};
        String[] expectedLetterGrades = new String[] {"A+"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testA() {
        double[] grades = new double[] {3.8};
        String[] expectedLetterGrades = new String[] {"A"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testAPlusAndA() {
        double[] grades = new double[] {4.0, 3.8};
        String[] expectedLetterGrades = new String[] {"A+", "A"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testBPlus() {
        double[] grades = new double[] {3.7};
        String[] expectedLetterGrades = new String[] {"B+"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testCPlus() {
        double[] grades = new double[] {3.0};
        String[] expectedLetterGrades = new String[] {"C+"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testDPlus() {
        double[] grades = new double[] {2.0};
        String[] expectedLetterGrades = new String[] {"D+"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
    
    @Test
    public void testE() {
        double[] grades = new double[] {0.0};
        String[] expectedLetterGrades = new String[] {"E"};
        assertArrayEquals(expectedLetterGrades, humaneval.correct.NUMERICAL_LETTER_GRADE.numerical_letter_grade(grades));
    }
}