package humaneval;

public class TEST_STRLEN {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.correct.STRLEN.strlen("");
        org.junit.Assert.assertEquals(
            result, 0
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.correct.STRLEN.strlen("x");
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.correct.STRLEN.strlen("asdasnakj");
        org.junit.Assert.assertEquals(
            result, 9
        );
    }
}
