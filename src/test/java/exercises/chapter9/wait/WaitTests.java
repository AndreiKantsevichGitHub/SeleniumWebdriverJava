package exercises.chapter9.wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();

        Assert.assertEquals
                (loadingPage.getLoadedText(), "Hello World!",
                        "Loaded text incorrect");
    }
}