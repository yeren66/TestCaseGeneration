    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WORDS_STRINGSTest {
    @Test
    public void words_stringsTEST() {
        ArrayList<String> result = WORDS_STRINGS.words_string("Hi, my name is John");
        assertArrayEquals(result.toArray(), new String[]{"Hi", "my", "name", "is", "John"});
    }
}