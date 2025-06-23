package org.example.testNG_practicing.DataProviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParallelTest {
    @DataProvider(parallel = true)
    public Object[][] getPersonData() {
        return new Object[][] {
                {"Loujain Ammer", 14},
                {"Mohammed Ahmad", 28},
                {"Younes Kamal", 31},
        };
    }

    @Test(dataProvider = "getPersonData")
    public void testWelcomeMessage(String name, int age) throws InterruptedException {
        System.out.printf("Welcome %s! Your age is: %d.%n", name, age);
        Thread.sleep(2000);
    }

    @Test(dataProvider = "getPersonData")
    public void testGoodbyeMessage(String name, int age) throws InterruptedException {
        System.out.printf("Bye bye %s!%n", name);
        Thread.sleep(2000);
    }
}
