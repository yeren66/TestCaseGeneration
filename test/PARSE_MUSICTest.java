package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PARSE_MUSICTest {
    @Test
    public void testEmptyInput() {
        String musicString = "";
        List<Integer> expectedResult = new ArrayList<>();
        
        List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(musicString);
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testSingleNote() {
        String musicString = "o";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        
        List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(musicString);
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testMultipleNotes() {
        String musicString = "o o";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(4);
        
        List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(musicString);
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testNoteWithDottedTail() {
        String musicString = "o.|";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        
        List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(musicString);
        
        assertEquals(expectedResult, result);
    }
    
    @Test
    public void testNoteWithDashedTail() {
        String musicString = "o|";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        
        List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(musicString);
        
        assertEquals(expectedResult, result);
    }
}
