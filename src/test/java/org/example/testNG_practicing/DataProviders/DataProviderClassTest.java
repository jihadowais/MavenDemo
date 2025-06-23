package org.example.testNG_practicing.DataProviders;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderClassTest {
    @Test(dataProvider = "sum", dataProviderClass = DataProviderClass.class)
    public void testSum(int expected, int num1, int num2, int num3) {
        int actual = ClassUnderTest.sum(num1, num2, num3);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "absolute", dataProviderClass = DataProviderClass.class)
    public void testAbsolute(int expected, int num1, int num2) {
        int actual = ClassUnderTest.absolute(num1, num2);
        Assert.assertEquals(actual, expected);
    }
}
