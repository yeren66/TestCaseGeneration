package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class CHECK_DICT_CASETest {
    
    @Test
    public void testCheckDictCase() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("b", "banana");
        assertTrue(CHECK_DICT_CASE.check_dict_case(dict));
    }
    
    @Test
    public void testCheckDictCaseMixed() {
        HashMap<Object, Object> dict = new HashMap<>();
        dict.put("a", "apple");
        dict.put("A", "banana");
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
    
    @Test
    public void testCheckDictCaseEmpty() {
        HashMap<Object, Object> dict = new HashMap<>();
        assertFalse(CHECK_DICT_CASE.check_dict_case(dict));
    }
}