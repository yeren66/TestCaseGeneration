package humaneval;
import static org.junit.Assert.*;

public class STRONGEST_EXTENSIONTest {
    @Test
    public void testStrongestExtension() {
        String[] extensions = {"SErviNGSliCes", "Cheese", "StuFfed"};
        assertEquals("Slices.SErviNGSliCes", humaneval.correct.STRONGEST_EXTENSION.strongest_extension("Slices", extensions));
    }
}