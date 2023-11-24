package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CHECK_DICT_CASE;
import java.util.HashMap;

public class CHECK_DICT_CASETest {
    @Test
    public void check_dict_caseTEST() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }
}