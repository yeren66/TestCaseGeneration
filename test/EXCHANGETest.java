package humaneval;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class EXCHANGETest {
    @Test
    public void testExchange_lst1HasOnlyEvenNumbers() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(4);
        lst1.add(6);
        
        String result = humaneval.correct.EXCHANGE.exchange(lst1, new ArrayList<>());
        
        assertEquals("YES", result);
    }
    
    @Test
    public void testExchange_lst2HasOnlyEvenNumbers() {
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(4);
        lst2.add(6);
        lst2.add(8);
        
        String result = humaneval.correct.EXCHANGE.exchange(new ArrayList<>(), lst2);
        
        assertEquals("YES", result);
    }
    
    @Test
    public void testExchange_lst1AndLst2HaveOnlyEvenNumbers() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(4);
        
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(6);
        lst2.add(8);
        
        String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        
        assertEquals("YES", result);
    }
    
    @Test
    public void testExchange_lst1AndLst2HaveOnlyOddNumbers() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(3);
        
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(5);
        lst2.add(7);
        
        String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        
        assertEquals("NO", result);
    }
    
    @Test
    public void testExchange_lst1AndLst2HaveOnlyMixedNumbers() {
        ArrayList<Integer> lst1 = new ArrayList<>();
        lst1.add(2);
        lst1.add(3);
        
        ArrayList<Integer> lst2 = new ArrayList<>();
        lst2.add(4);
        lst2.add(6);
        
        String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        
        assertEquals("NO", result);
    }
}