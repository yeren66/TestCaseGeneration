
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.EXCHANGE;
import java.util.ArrayList;

public class EXCHANGETest {
    @Test
    public void exchangeTEST() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        
        // Test case 1: lst1 and lst2 have only even numbers
        lst1.add(2);
        lst1.add(4);
        lst1.add(6);
        lst2.add(8);
        lst2.add(10);
        lst2.add(12);
        
        String result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
        
        // Test case 2: lst1 has only odd numbers and lst2 has only even numbers
        lst1.clear();
        lst2.clear();
        lst1.add(1);
        lst1.add(3);
        lst1.add(5);
        lst2.add(2);
        lst2.add(4);
        lst2.add(6);
        
        result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("YES", result);
        
        // Test case 3: lst1 has only even numbers and lst2 has only odd numbers
        lst1.clear();
        lst2.clear();
        lst1.add(2);
        lst1.add(4);
        lst1.add(6);
        lst2.add(1);
        lst2.add(3);
        lst2.add(5);
        
        result = EXCHANGE.exchange(lst1, lst2);
        assertEquals("NO", result);
    }
}