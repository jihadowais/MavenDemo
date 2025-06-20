package org.example.testNG_practicing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependencyDemoTest {
    @BeforeClass
    public void setUp(){ System.out.println("PriorityDemo Class -> @BeforeClass Annotation. setUp() method."); }

    @AfterClass
    public void clean(){ System.out.println("PriorityDemo Class -> @AfterClass Annotation. clean() method."); }

    @Test(priority = 1, dependsOnMethods = {"testMethodC", "testMethodD"})
    public void testMethodB(){ System.out.println("PriorityDemo Class -> @Test Annotation. testMethodB() test method."); }

    @Test(priority = 2)
    public void testMethodA(){
        System.out.println("PriorityDemo Class -> @Test Annotation. testMethodA() test method.");
    }

    @Test(priority = 4)
    public void testMethodC(){
        System.out.println("PriorityDemo Class -> @Test Annotation. testMethodC() test method.");
        Assert.fail();
    }

    @Test(priority = 3)
    public void testMethodD(){
        System.out.println("PriorityDemo Class -> @Test Annotation. testMethodD() test method.");
    }
}
