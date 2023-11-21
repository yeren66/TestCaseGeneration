package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FIX_SPACESTest {
    @Test
    public void test1() {
        String text = "Example";
        assertEquals("Example", humaneval.correct.FIX_SPACES.fix_spaces(text));
    }
    
    @Test
    public void test2() {
        String text = "Example 1";
        assertEquals("Example_1", humaneval.correct.FIX_SPACES.fix_spaces(text));
    }
    
    @Test
    public void test3() {
        String text = " Example 2";
        assertEquals("_Example_2", humaneval.correct.FIX_SPACES.fix_spaces(text));
    }
    
    @Test
    public void test4() {
        String text = " Example   3";
        assertEquals("_Example-3", humaneval.correct.FIX_SPACES.fix_spaces(text));
    }
}