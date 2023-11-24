package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
public class STRONGEST_EXTENSIONTest {
    @Test
    public void strongest_extensionTEST() {
        String class_name = "Slices";
        String[] extensions = {"SErviNGSliCes", "Cheese", "StuFfed"};
        assertEquals("Slices.SErviNGSliCes", STRONGEST_EXTENSION.strongest_extension(class_name, extensions));
    }
}