package humaneval;
public class TOTAL_MATCHTest {
    public static List<String> humaneval.correct.TOTAL_MATCH.total_match(List<String> lst1, List<String> lst2) {
        int l1 = 0;
        for (String st : lst1)
            l1 += st.length();
        int l2 = 0;
        for (String st : lst2)
            l2 += st.length();
        
        return l1 <= l2 ? lst1 : lst2;
    }
}