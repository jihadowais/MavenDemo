package org.example.testNG_practicing.CustomParameters;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CustomParametersDemoTest {
    @BeforeClass
    @Parameters({"browser", "OS"})
    public void setUp(String browser, String OS) {
        System.out.println("Running TestNG setUp method..");
        System.out.println("Parameter browser value: " + browser);
        System.out.println("Parameter OS value: " + OS);
    }

    @Test
    @Parameters({"Models"})
    public void testMethod(String response) {
        System.out.println("Running Test Method...");
        String[] responseArray = response.split(",");
        System.out.println("Response: " + response);
        System.out.println("Response element 1: " + responseArray[0]);
        System.out.println("Response element 2: " + responseArray[1]);
    }
}
