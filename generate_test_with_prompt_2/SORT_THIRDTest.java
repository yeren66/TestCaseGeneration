package humaneval;

import static org.junit.jupiter.api.Assertions.*;

class SORT_THIRDTest {
    @Test
    void humaneval.correct.SORT_THIRD.sort_third() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        
        List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(list);
        
        assertEquals(result, new ArrayList<>(Arrays.asList(0, 3, 6, 9)));
    }
}