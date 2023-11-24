package humaneval;
import java.util.List;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.INTERSPERSE;
import java.util.ArrayList;
import java.util.List;

public class INTERSPERSETest {
    @Test
    public void intersperseTEST() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int delimeter = 0;
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(1);
        expectedResult.add(0);
        expectedResult.add(2);
        expectedResult.add(0);
        expectedResult.add(3);
        
        assertEquals(expectedResult, INTERSPERSE.intersperse(numbers, delimeter));
    }
}