package humaneval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UNIQUETest {
    public static List<Integer> humaneval.correct.UNIQUE.unique(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();

        for (Integer n : l){
            if (result.contains(n))
                continue;
            result.add(n);
        }
        Collections.sort(result);

        return result;
    }
}