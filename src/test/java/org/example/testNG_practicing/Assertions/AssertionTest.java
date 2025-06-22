package org.example.testNG_practicing.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {

    @Test
    public void testSum(){
        System.out.println("Running Test -> testSum...");
        int expectedSum = 3;
        int testDataFirstNumber = 1;
        int testDataSecondNumber = 2;

        int actualSum = ClassUnderTest.sum(testDataFirstNumber, testDataSecondNumber);
        Assert.assertEquals(actualSum, expectedSum);
    }

    @Test
    public void testFullName(){
        System.out.println("Running Test -> testFullName...");
        String expectedFullName = "Loujain Amer";
        String testDataFirstName = "Loujain";
        String testDataLastName = "Amer";

        String actualFullName = ClassUnderTest.getFullName(testDataFirstName, testDataLastName);
        Assert.assertEquals(actualFullName, expectedFullName);
    }

    @Test
    public void testArray(){
        System.out.println("Running Test -> testArray...");
        int[] expectedArray = {1, 2, 3};

        int[] actualArray = ClassUnderTest.getSampleArray();
        Assert.assertEquals(actualArray, expectedArray);
    }
}
