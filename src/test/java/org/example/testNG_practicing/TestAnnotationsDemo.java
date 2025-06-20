package org.example.testNG_practicing;

import org.testng.annotations.*;

public class TestAnnotationsDemo {
    @BeforeSuite
    public void beforeSuite () {
        System.out.println("This will run before running the whole suite.");
    }

    @AfterSuite
    public void afterSuite () {
        System.out.println("This will run after running the whole suite.");
    }

    @BeforeTest
    public void beforeTest () {
        System.out.println("This will run before running the class tests.");
    }

    @AfterTest
    public void afterTest () {
        System.out.println("This will run after running the class tests.");
    }

    @BeforeClass
    public void setUp() {
        System.out.println("This will run before running the whole class. ex. setUp method.");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("This will run after running the whole class. ex. cleanUp method.");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("This will run before running any test method.");
    }

    @AfterMethod
    public void afterMethod () {
        System.out.println("This will run after running any test method.");
    }

    @Test
    public void testMethod1() {
        System.out.println("This is my test method 1.");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is my test method 2.");
    }
}
