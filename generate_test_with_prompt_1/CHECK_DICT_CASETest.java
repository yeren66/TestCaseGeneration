package humaneval;

import static org.junit.Assert.*;
import java.util.HashMap;

public class CHECK_DICT_CASETest {
    @Test
    public void testCheckDictCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict)); // empty dictionary should return False
        
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict)); // lower case keys only should return True
        
        dict.put("A", "banana");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict)); // mixed case keys should return False
        
        dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", 8);
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict)); // non-string key should return False
        
        dict = new HashMap<>();
        dict.put("Name", "John");
        dict.put("Age", "36");
        dict.put("City", "Houston");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict)); // mixed case keys should return False
        
        dict = new HashMap<>();
        dict.put("STATE", "NC");
        dict.put("ZIP", "12345");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict)); // upper case keys only should return True
    }
}
