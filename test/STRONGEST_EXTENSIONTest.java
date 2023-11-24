package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STRONGEST_EXTENSION;

public class STRONGEST_EXTENSIONTest {
    @Test
    public void strongest_extensionTEST() {
        String[] extensions = new String[]{"SErviNGSliCes", "Cheese", "StuFfed"};
        assertEquals("Slices.SErviNGSliCes", STRONGEST_EXTENSION.strongest_extension("Slices", extensions));
    }
}