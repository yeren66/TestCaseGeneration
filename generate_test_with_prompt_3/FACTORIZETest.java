package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FACTORIZETest {
    @Test
    public void factorizeTEST() {
        int n = 120;
        List<Integer> result = new ArrayList<Integer>();
        int i = 2;
        
        while (i <= (int)(Math.sqrt(n) + 1)){
            if (n % i == 0){
                result.add(i);
                n = n / i;
            } else{
                i += 1;
            }
        }
        
        if (n > 1){
            result.add(n);
        }
        
        assertEquals(result, FACTORIZE.factorize(n));
    }
}