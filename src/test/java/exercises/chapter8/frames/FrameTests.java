package exercises.chapter8.frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrameText() {
        var nestedFramesPage =
                homePage.clickFramesPage().clickNestedFrames();

        Assert.assertEquals
                (nestedFramesPage.getLeftFrameText(), "LEFT",
                        "Left frame text incorrect");
        Assert.assertEquals
                (nestedFramesPage.getBottomFrameText(), "BOTTOM",
                        "Bottom frame text incorrect");
    }
}