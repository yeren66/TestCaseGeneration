    
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class REVERSE_DELETETest {
    @Test
    public void reverse_deleteTEST() {
        ArrayList<Object> actual = REVERSE_DELETE.reverse_delete("abcde", "ae");
        assertEquals(new ArrayList<> (Arrays.asList("bcd", false)),actual);
        
        actual = REVERSE_DELETE.reverse_delete("abcdef","b");
        assertEquals(new ArrayList<>(Arrays.asList("acdef",false)),actual);
      
        actual = REVERSE_DELETE.reverse_delete("abcdedcba","ab");
        assertEquals(new ArrayList<> (Arrays.asList("cdedc",true)),actual);
    }
}