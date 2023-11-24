package humaneval;
import org.junit.jupiter.api.Test;
import java.util.*;

class REVERSE_DELETE {
    public static ArrayList<Object> humaneval.correct.REVERSE_DELETE.reverse_delete(String s, String c) {
        // Your code here
    }
}

class ReverseDeleteTest {
    @Test
    void testReverseDelete() {
        ArrayList<Object> expected = new ArrayList<>();
        expected.add("bcd");
        expected.add(false);
        
        String s = "abcde";
        String c = "ae";
        ArrayList<Object> actual = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete2() {
        ArrayList<Object> expected = new ArrayList<>();
        expected.add("acdef");
        expected.add(false);
        
        String s = "abcdef";
        String c = "b";
        ArrayList<Object> actual = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expected, actual);
    }
    
    @Test
    void testReverseDelete3() {
        ArrayList<Object> expected = new ArrayList<>();
        expected.add("cdedc");
        expected.add(true);
        
        String s = "abcdedcba";
        String c = "ab";
        ArrayList<Object> actual = humaneval.correct.REVERSE_DELETE.reverse_delete(s, c);
        
        assertEquals(expected, actual);
    }
}