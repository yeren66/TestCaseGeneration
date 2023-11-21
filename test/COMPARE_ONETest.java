package humaneval;
import static org.junit.Assert.*;

public class COMPARE_ONETest {
    public static Object humaneval.correct.COMPARE_ONE.compare_one(Object a, Object b) {
        double temp_a = 0, temp_b = 0;
        if(a instanceof String) {
            String temp_a_string = a.toString();
            temp_a_string = temp_a_string.replace(',', '.');
            temp_a = Double.parseDouble(temp_a_string);
        }
        if(b instanceof String) {
            String temp_b_string = b.toString();
            temp_b_string = temp_b_string.replace(',', '.');
            temp_b = Double.parseDouble(temp_b_string);
        }
        if(a instanceof Double) temp_a = (Double) a;
        if(b instanceof Double) temp_b = (Double) b;
        if(a instanceof Integer) temp_a = ((Integer) a).doubleValue();
        if(b instanceof Integer) temp_b = ((Integer) b).doubleValue();
        if(temp_a == temp_b) return null;
        if(temp_a > temp_b) return a;
        else return b;
    }
}

public class TestCOMPAREONE {
    @Test
    public void testCompareInteger() {
        int a = 5, b = 10;
        Object result = humaneval.correct.COMPARE_ONE.compare_one(a, b);
        assertEquals(result, b); // Expected result: 10
    }
}