package org.example.testNG_practicing.Listeners;

import org.testng.annotations.*;

@Listeners(CustomITestListeners.class)
public class CustomListenersTest1 {
    @BeforeTest
    public void beforeTest() { System.out.println("@BeforeTest -> This will run before running the <test>."); }

    @AfterTest
    public void afterTest() { System.out.println("@AfterTest -> This will run after running the <test>."); }

    @BeforeClass
    public void setUp() { System.out.println("@BeforeClass -> This will run before running the whole class. ex. setUp method."); }

    @AfterClass
    public void cleanUp() { System.out.println("@AfterClass -> This will run after running the whole class. ex. cleanUp method."); }

    @BeforeMethod
    public void beforeMethod() { System.out.println("@BeforeMethod -> This will run before running any test method."); }

    @AfterMethod
    public void afterMethod() { System.out.println("@AfterMethod -> This will run after running any test method."); }

    @Test
    public void testMethod1() { System.out.println("@Test -> This is my test method 1. [CustomListenersTest1]"); }

    @Test
    public void testMethod2() { System.out.println("@Test -> This is my test method 2. [CustomListenersTest1]"); }

}
