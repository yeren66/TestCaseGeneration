package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SOLUTIONTest {

    @Test
    public void testSolution() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(8);
        lst.add(7);
        lst.add(1);
        assertEquals(12, humaneval.correct.SOLUTION.solution(lst));
    }

    @Test
    public void testSolutionWithOnlyOddElements() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(3);
        lst.add(5);
        lst.add(7);
        lst.add(9);
        assertEquals(9, humaneval.correct.SOLUTION.solution(lst));
    }

    @Test
    public void testSolutionWithNoOddElements() {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(20);
        lst.add(30);
        lst.add(40);
        assertEquals(0, humaneval.correct.SOLUTION.solution(lst));
    }
}