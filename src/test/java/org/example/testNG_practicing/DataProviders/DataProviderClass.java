package org.example.testNG_practicing.DataProviders;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider
    public Object[][] getSumData() {
        return new Object[][] {
                {0, 0, 0, 0},
                {3, 1, 1, 1},
                {100, 6, 15, 79},
                {1000, 500, 300, 200},
        };
    }

    @DataProvider
    public Object[][] getAbsoluteData() {
        return new Object[][] {
                {0, 0, 0},
                {0, 8, 8},
                {7, 8, 1},
                {7, 1, 8},
                {7, -1, -8},
                {9, -1, 8},
                {9, 1, -8},
                {300, 400, 100},
        };
    }
}
