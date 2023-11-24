package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class DO_ALGEBRATest {
    @Test
    public void testSingleOperand() {
        // Test that a single operand returns the same value
        int[] operands = new int[1];
        operands[0] = 2;
        String[] operators = new String[0];
        
        double result = humaneval.correct.DO_ALGEBRA.do_algebra(operators, operands);
        
        assertEquals(2.0, result, 0.001);
    }
    
    @Test
    public void testSingleOperator() {
        // Test that a single operator returns the same value
        int[] operands = new int[3];
        operands[0] = 2;
        operands[1] = 3;
        operands[2] = 4;
        String[] operators = new String[2];
        operators[0] = "+";
        
        double result = humaneval.correct.DO_ALGEBRA.do_algebra(operators, operands);
        
        assertEquals(9.0, result, 0.001);
    }
    
    @Test
    public void testMultipleOperators() {
        // Test that multiple operators return the correct value
        int[] operands = new int[4];
        operands[0] = 2;
        operands[1] = 3;
        operands[2] = 4;
        operands[3] = 5;
        String[] operators = new String[3];
        operators[0] = "+";
        operators[1] = "*";
        
        double result = humaneval.correct.DO_ALGEBRA.do_algebra(operators, operands);
        
        assertEquals(18.0, result, 0.001);
    }
}