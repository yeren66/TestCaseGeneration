    
     package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
public class SOLVE_STRINGTest {
    @Test
    public void solve_stringTEST() {
        assertEquals("AB",SOLVE_STRING.solve_string("ab"));
        assertEquals("#A@c",SOLVE_STRING.solve_string("#a@C"));
        assertEquals("4321",SOLVE_STRING.solve_string("1234"));
    }
}