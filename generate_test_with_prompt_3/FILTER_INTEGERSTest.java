
package humaneval.correct;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class FILTER_INTEGERSTest {
    @Test
    public void filter_integersTEST() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add("2");
        values.add(3L);
        
        List<Integer> result = FILTER_INTEGERS.filter_integers(values);
        
        Assert.assertEquals(result, new ArrayList<Integer>(Arrays.asList(1, 3)));
    }
}