package org.example.testNG_practicing.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomITestListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart -> Invoked when TM starts.");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess -> Invoked when TM finishes & succeeded.");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure -> Invoked when TM fails.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped -> Invoked when TM is skipped.");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("onTestFailedWithTimeout -> Invoked when TM fails with timeout.");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart -> Invoked when <test> starts.");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish -> Invoked when <test> finishes.");
    }
}
