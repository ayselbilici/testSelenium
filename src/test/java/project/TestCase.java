package project;

import project.pages.Homepage;
import org.junit.Assert;
import org.junit.Test;


public class TestCase extends BaseTest {

    @Test
    public void testCase1() throws InterruptedException {


        String searchAreaText= "What are you looking for?";
        String highlightText= "happy";

        Homepage homePage = new Homepage(webDriver);
        homePage.clickSearchButton();
        Assert.assertEquals(homePage.getSearchAreaText(),searchAreaText);
        homePage.sendSearchText();
        homePage.clickSearchButton2();
        Thread.sleep(3000);
        homePage.scrollSearchArea();
        Assert.assertEquals(homePage.getHighlightText(),highlightText);

    }

    }


