     package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class CHECK_DICT_CASETest {
    @Test
    public void check_dict_caseTEST() {
        HashMap<Object, Object> dict1 = new HashMap<>();
        dict1.put("a", "apple");
        dict1.put("b", "banana");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict1));
        
        HashMap<Object, Object> dict2 = new HashMap<>();
        dict2.put("a", "apple");
        dict2.put("A", "banana");
        dict2.put("B", "banana");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict2));
        
        HashMap<Object, Object> dict3 = new HashMap<>();
        dict3.put("a", "apple");
        dict3.put(8, "banana");
        dict3.put("a", "apple");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict3));
        
        HashMap<Object, Object> dict4 = new HashMap<>();
        dict4.put("Name", "John");
        dict4.put("Age", "36");
        dict4.put("City", "Houston");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict4));
        
        HashMap<Object, Object> dict5 = new HashMap<>();
        dict5.put("STATE", "NC");
        dict5.put("ZIP", "12345");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict5));
    }
}