package client;

public class TestLogger {

    public static TestMetric Run() {
        int totalTests = 0;
        int totalPassed = 0;
        int totalFailed = 0;

        if (TestLogAll()) {
            totalTests += 1;
            totalPassed += 1;
        } else {
            totalTests += 1;
            totalFailed += 1;
        }

        TestMetric t = new TestMetric();
        t.Total = totalTests;
        t.Pass = totalPassed;
        t.Fail = totalFailed;

        return t;
    }

    public static boolean TestLogAll() {
        boolean pass = false;

        // SETUP ------------------------------------
        // /SETUP ------------------------------------

        return pass;
    }

}