package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
public class SIMPLIFYTest {
	@Test
	public void testSimplify() {
		String x = "1/5";
		String n = "5/1";
		boolean expected = true;
		assertEquals(expected, humaneval.correct.SIMPLIFY.simplify(x, n));
	}
}