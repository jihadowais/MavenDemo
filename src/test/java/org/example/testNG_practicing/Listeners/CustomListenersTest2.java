package org.example.testNG_practicing.Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomITestListeners.class)
public class CustomListenersTest2 {
    @Test
    public void testMethod1() {
        System.out.println("@Test -> This is my test method 1. [CustomListenersTest2]");
        Assert.fail();
    }

    @Test(dependsOnMethods = "testMethod1")
    public void testMethod2() { System.out.println("@Test -> This is my test method 2. [CustomListenersTest2]"); }
}