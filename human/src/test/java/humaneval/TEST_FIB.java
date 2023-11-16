package humaneval;

public class TEST_FIB {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = humaneval.correct.FIB.fib(10);
        org.junit.Assert.assertEquals(
            result, 55
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = humaneval.correct.FIB.fib(1);
        org.junit.Assert.assertEquals(
            result, 1
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = humaneval.correct.FIB.fib(8);
        org.junit.Assert.assertEquals(
            result, 21
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = humaneval.correct.FIB.fib(11);
        org.junit.Assert.assertEquals(
            result, 89
        );
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = humaneval.correct.FIB.fib(12);
        org.junit.Assert.assertEquals(
            result, 144
        );
    }
}
