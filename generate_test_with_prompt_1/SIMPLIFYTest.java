package humaneval;

public class SIMPLIFYTest {
    public static boolean humaneval.correct.SIMPLIFY.simplify(String x, String n) {
        int a = Integer.parseInt(x.split("/")[0]);
        int b = Integer.parseInt(x.split("/")[1]);
        int c = Integer.parseInt(n.split("/")[0]);
        int d = Integer.parseInt(n.split("/")[1]);

        if (a == 0 || b == 0 || c == 0 || d == 0) {
            return false;
        }

        int numerator = a * c;
        int denom = b * d;
        if (numerator % denom == 0 && denom != 1) {
            return true;
        } else {
            return false;
        }
    }
}
