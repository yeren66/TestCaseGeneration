package humaneval;

import static org.junit.Assert.*;

public class ODD_COUNTTest {

    @Test
    public void testOddCount() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("1234567");
        ArrayList<String> result = humaneval.correct.ODD_COUNT.odd_count(lst);
        assertEquals(1, result.size());
        assertEquals("the number of odd elements 4n the str4ng 4 of the 4nput.", result.get(0));
    }

    @Test
    public void testOddCountMultiple() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("3");
        lst.add("11111111");
        ArrayList<String> result = humaneval.correct.ODD_COUNT.odd_count(lst);
        assertEquals(2, result.size());
        assertEquals("the number of odd elements 1n the str1ng 1 of the 1nput.", result.get(0));
        assertEquals("the number of odd elements 8n the str8ng 8 of the 8nput.", result.get(1));
    }
}
