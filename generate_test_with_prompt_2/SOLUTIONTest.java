package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import humaneval.correct.SOLUTION;

public class SOLUTIONTest {
    @Test
    public void testSolution() {
        ArrayList<Integer> lst = new ArrayList<>();
        int result = humaneval.correct.SOLUTION.solution(lst);
        assertEquals(result, 0);
        
        lst.add(5);
        result = humaneval.correct.SOLUTION.solution(lst);
        assertEquals(result, 5);
        
        lst.add(8);
        result = humaneval.correct.SOLUTION.solution(lst);
        assertEquals(result, 13);
        
        lst.add(7);
        result = humaneval.correct.SOLUTION.solution(lst);
        assertEquals(result, 20);
    }
}