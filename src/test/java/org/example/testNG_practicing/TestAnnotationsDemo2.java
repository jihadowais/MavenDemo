package org.example.testNG_practicing;

import org.testng.annotations.*;

/*
TestAnnotationsDemo1.beforeSuite() -> @BeforeSuite
TestAnnotationsDemo2.beforeSuite() -> @BeforeSuite

TestAnnotationsDemo1.beforeTest() -> @BeforeTest
    TestAnnotationsDemo1.beforeClass() -> @BeforeClass

        TestAnnotationsDemo1.beforeMethod() -> @BeforeMethod
            TestAnnotationsDemo1.testMethod1() -> @Test
        TestAnnotationsDemo1.afterMethod()-> @AfterTest

        TestAnnotationsDemo1.beforeMethod() -> @BeforeMethod
            TestAnnotationsDemo1.testMethod2() -> @Test
        TestAnnotationsDemo1.afterMethod()-> @AfterTest

    TestAnnotationsDemo1.afterClass()-> @AfterClass
TestAnnotationsDemo1.afterTest()-> @AfterMethod

TestAnnotationsDemo2.beforeTest() -> @BeforeTest
    TestAnnotationsDemo2.beforeClass() -> @BeforeClass

        TestAnnotationsDemo2.beforeMethod() -> @BeforeMethod
            TestAnnotationsDemo2.testMethod1() -> @Test
        TestAnnotationsDemo2.afterMethod()-> @AfterTest

        TestAnnotationsDemo2.beforeMethod() -> @BeforeMethod
            TestAnnotationsDemo2.testMethod2() -> @Test
        TestAnnotationsDemo2.afterMethod()-> @AfterTest

    TestAnnotationsDemo2.afterClass()-> @AfterClass
TestAnnotationsDemo2.afterTest()-> @AfterMethod

TestAnnotationsDemo1.afterSuite() -> @AfterSuite
TestAnnotationsDemo2.afterSuite() -> @AfterSuite

*/

public class TestAnnotationsDemo2 {
    @BeforeSuite
    public void beforeSuite () { System.out.println("TestAnnotationsDemo2 class: This will run before running the whole suite."); }

    @AfterSuite
    public void afterSuite () { System.out.println("TestAnnotationsDemo2 class: This will run after running the whole suite."); }

    @BeforeTest
    public void beforeTest () { System.out.println("TestAnnotationsDemo2 class: This will run before running the class tests."); }

    @AfterTest
    public void afterTest () { System.out.println("TestAnnotationsDemo2 class: This will run after running the class tests."); }

    @BeforeClass
    public void setUp() { System.out.println("TestAnnotationsDemo2 class: This will run before running the whole class. ex. setUp method."); }

    @AfterClass
    public void cleanUp() { System.out.println("TestAnnotationsDemo2 class: This will run after running the whole class. ex. cleanUp method."); }

    @BeforeMethod
    public void beforeMethod () { System.out.println("TestAnnotationsDemo2 class: This will run before running any test method."); }

    @AfterMethod
    public void afterMethod () { System.out.println("TestAnnotationsDemo2 class: This will run after running any test method."); }

    @Test
    @Ignore
    public void testMethod1() {
        System.out.println("TestAnnotationsDemo2 class: This is my test method 1.");
    }

    @Test(enabled = false)
    public void testMethod2() {
        System.out.println("TestAnnotationsDemo2 class: This is my test method 2.");
    }
}
