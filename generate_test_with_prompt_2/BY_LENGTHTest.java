package humaneval;
import static org.junit.Assert.*;

public class BY_LENGTHTest {
    @Test
    public void humaneval.correct.BY_LENGTH.by_length_shouldReturnCorrectString() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(8);
        input.add(9);
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Nine");
        expectedOutput.add("Eight");
        expectedOutput.add("Seven");
        expectedOutput.add("Six");
        expectedOutput.add("Five");
        expectedOutput.add("Four");
        expectedOutput.add("Three");
        expectedOutput.add("Two");
        expectedOutput.add("One");
        
        ArrayList<String> actualOutput = humaneval.correct.BY_LENGTH.by_length(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void humaneval.correct.BY_LENGTH.by_length_shouldReturnEmptyArrayForEmptyInput() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<String> expectedOutput = new ArrayList<>();
        
        ArrayList<String> actualOutput = humaneval.correct.BY_LENGTH.by_length(input);
        
        assertEquals(expectedOutput, actualOutput);
    }
}