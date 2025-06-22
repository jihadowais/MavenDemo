package org.example.testNG_practicing.Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
    public void testSumAll(){
        System.out.println("Running Test -> testSum...");
        int expectedSum1 = 3;
        int testDataFirstNumber = 1;
        int testDataSecondNumber = 2;

        int expectedSum2 = 8;
        int testDataThirdNumber = 8;
        int testDataFourthNumber = 5;

        int actualSum1 = ClassUnderTest.sum(testDataFirstNumber, testDataSecondNumber);
        int actualSum2 = ClassUnderTest.sum(testDataThirdNumber, testDataFourthNumber);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSum1, expectedSum1);
        softAssert.assertEquals(actualSum2, expectedSum2);
        softAssert.assertAll();
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
