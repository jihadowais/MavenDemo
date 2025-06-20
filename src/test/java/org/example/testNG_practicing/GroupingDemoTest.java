package org.example.testNG_practicing;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupingDemoTest {
    @BeforeClass(alwaysRun = true)
    public void setUp(){ System.out.println("GroupingDemoTest Class -> @BeforeClass Annotation. setUp() method."); }

    @AfterClass(alwaysRun = false)
    public void clean(){ System.out.println("GroupingDemoTest Class -> @AfterClass Annotation. clean() method."); }

    @Test(groups = {"IOS", "Mobile"})
    public void testIOS13(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testIOS13() test method..."); }

    @Test(groups = {"IOS", "LowVersions", "Mobile"})
    public void testIOS01(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testIOS01() test method..."); }

    @Test(groups = {"Android", "Mobile"})
    public void testAndroid14(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testAndroid14() test method..."); }

    @Test(groups = {"Android", "LowVersions", "Mobile"})
    public void testAndroid01(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testAndroid01() test method..."); }

    @Test(groups = {"Android", "Mobile"})
    public void testHawaii(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running Hawaii() test method..."); }

    @Test(groups = {"Chrome", "Browser"})
    public void testChrome(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testChrome() test method..."); }

    @Test(groups = {"Firefox", "Browser"})
    public void testFirefox(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testFirefox() test method..."); }

    @Test(groups = {"Opera", "Browser"})
    public void testOpera(){ System.out.println("GroupingDemoTest Class -> @Test Annotation. Running testOpera() test method..."); }

}
