package humaneval;
import static org.junit.jupiter.api.Assertions.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class DO_ALGEBRATest {
    @Test
    public void testDoAlgebra() throws ScriptException {
        String[] operator = new String[]{"+", "-"};
        int[] operand = new int[]{2, 3, 4};
        
        assertEquals(9.0, humaneval.correct.DO_ALGEBRA.do_algebra(operator, operand), 1e-6);
    }
}