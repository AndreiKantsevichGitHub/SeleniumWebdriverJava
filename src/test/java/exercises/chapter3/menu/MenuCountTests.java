package exercises.chapter3.menu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuCountTests extends BaseTests {

    @Test
    public void TestMenuCount() {
        var menu = homePage.clickShiftingContent().clickMenuElement();
        var count = menu.countMenuElement();
        Assert.assertEquals
                (count, 5, "Number of item incorrect");
    }
}
