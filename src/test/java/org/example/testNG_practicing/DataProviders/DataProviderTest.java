package org.example.testNG_practicing.DataProviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name = "fullname")
    public Object[][] getFullName() {
        return new Object[][] {
                {"Loujain Ammer", "Loujain", "Ammer"},
                {"Mohammed Ahmad", "Mohammed", "Ahmad"},
                {"Younes Kamal", "Younes", "Kamal"},
        };
    }

    @Test(dataProvider = "fullname")
    public void testFullName(String expected, String firstname, String lastname) {
        String actual = ClassUnderTest.getFullName(firstname, lastname);
        Assert.assertEquals(actual, expected);
    }
}
