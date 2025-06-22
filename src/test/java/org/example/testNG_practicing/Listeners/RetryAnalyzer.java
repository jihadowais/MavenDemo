package org.example.testNG_practicing.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private static final int MAX_COUNTS = 3;
    private int retryCounter = 0;

    /**
     * Retry running a failed or skipped test method for max 3 counts.
     * @param result
     * @return true if retried to run the method, and false if not.
     */
    @Override
    public boolean retry(ITestResult result) {
        if (retryCounter < MAX_COUNTS) {
            if (result.getStatus() == ITestResult.FAILURE) {
                System.out.println("Retrying Test Method: '"
                        + result.getName()
                        + "' with status: '"
                        + getStatusName(result.getStatus())
                        + "' for "
                        + (retryCounter + 1)
                        + " time(s)."
                );
                retryCounter++;
                return true;
            }
        }
        return false;
    }

    /**
     * Converts a Test Method's INTEGER status code to an equivalent meaningful name in a String.
     * @param statusCode Test Method's Integer status code.
     * @return An equivalent name String to the Test method's status code.
     */
    private String getStatusName(int statusCode) {
        switch (statusCode) {
            case ITestResult.SUCCESS:
                return "SUCCESS";
            case ITestResult.SKIP:
                return "SKIP";
            case ITestResult.FAILURE:
                return "FAILURE";
            default:
                return "";
        }
    }
}
