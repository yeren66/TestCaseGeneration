package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class DO_ALGEBRATest {
    @Test
    public void do_algebraTEST() throws NumberFormatException, ScriptException {
        String[] operator = {"+", "-"};
        int[] operand = {2, 3, 4, 5};
        assertEquals(9.0, DO_ALGEBRA.do_algebra(operator, operand), 1e-6);
    }
}