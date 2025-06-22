package org.example.testNG_practicing.Listeners;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RetryListenerTest {
    /**
     * Test Method 1 that is forced to fail and uses the retryAnalyzer attribute
     * to test invoking retry method in FAILURE status.
     */
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testMethod1() {
        System.out.println("@Test -> This is my test method 1. [RetryListenerTest]");
        Assert.fail();
    }

    /**
     * Test Method 2 that depends on the failed Test Method 1 to be skipped
     * to test NOT invoking retry method in SKIP status.
     */
    @Test(dependsOnMethods = "testMethod1", retryAnalyzer = RetryAnalyzer.class)
    public void testMethod2() { System.out.println("@Test -> This is my test method 2. [RetryListenerTest]"); }

    /**
     * Test Method 3 that is succeeded to test NOT invoking retry in SUCCESS status.
     */
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testMethod3() { System.out.println("@Test -> This is my test method 3. [RetryListenerTest]"); }

    /**
     * An after method will be invoked after every method to show every method name & status.
     * @param result to access the test method status and name.
     */
    @AfterMethod
    public void testStatus(ITestResult result) {
        System.out.println("\nAfter Method");

        if (result.getStatus() == ITestResult.FAILURE)
            System.out.println("FAILED: " + result.getName());
        else if (result.getStatus() == ITestResult.SUCCESS)
            System.out.println("SUCCEEDED: " + result.getName());
        else if (result.getStatus() == ITestResult.SKIP)
            System.out.println("SKIPPED: " + result.getName());
    }
}
