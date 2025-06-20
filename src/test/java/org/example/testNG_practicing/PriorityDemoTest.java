package org.example.testNG_practicing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemoTest {
    @BeforeClass
    public void setUp(){ System.out.println("PriorityDemoTest Class -> @BeforeClass Annotation. setUp() method."); }

    @AfterClass
    public void clean(){ System.out.println("PriorityDemoTest Class -> @AfterClass Annotation. clean() method."); }

    @Test(priority = 0)
    public void testMethodB(){ System.out.println("PriorityDemoTest Class -> @Test Annotation. testMethodB() test method."); }

    @Test(priority = 1)
    public void testMethodA(){
        System.out.println("PriorityDemoTest Class -> @Test Annotation. testMethodA() test method.");
        Assert.fail();
    }

    @Test(priority = 2)
    public void testMethodC(){ System.out.println("PriorityDemoTest Class -> @Test Annotation. testMethodC() test method."); }
}
