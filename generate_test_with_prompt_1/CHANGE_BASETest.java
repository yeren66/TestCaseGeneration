package humaneval;
import static org.junit.jupiter.api.Assertions.*;

class CHANGE_BASETest {
    @Test
    void testChangeBase() {
        assertEquals("22", humaneval.correct.CHANGE_BASE.change_base(8, 3));
        assertEquals("1000", humaneval.correct.CHANGE_BASE.change_base(8, 2));
        assertEquals("111", humaneval.correct.CHANGE_BASE.change_base(7, 2));
    }
}