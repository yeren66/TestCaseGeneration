package humaneval;
import static org.junit.Assert.*;

public class STRONGEST_EXTENSIONTest {
    @Test
    public void testSingleExtension() {
        String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension("Slices", new String[]{"SErviNGSliCes"});
        assertEquals("Slices.SErviNGSliCes", result);
    }

    @Test
    public void testMultipleExtensionsWithSameStrength() {
        String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension("my_class", new String[]{"AA", "Be", "CC"});
        assertEquals("my_class.AA", result);
    }

    @Test
    public void testNoExtensions() {
        String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension("Slices", new String[0]);
        assertNull(result);
    }
}