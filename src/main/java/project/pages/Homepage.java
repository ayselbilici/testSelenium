package project.pages;

import project.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Helper {
    private final By searchButton = By.xpath("//*[@id=\"site-header\"]/div/div[2]/div/div/div[1]");
    private final By searchArea=By.xpath("//*[@id=\"global-search\"]");
    private final By searchAreaText = By.xpath("//*[@id=\"search\"]/div/div/div/h3");
    private final By searchButton2 = By.xpath("//*[@id=\"search\"]/div/div/div/p/button");
    private final By highlightText = By.xpath("/html/body/main/div[2]/div/section/ul/li[1]/a/section/p/span[1]");

    public Homepage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSearchButton() {
        click(searchButton,1);
    }

    public void sendSearchText() { sendText(searchArea,"happy"); }

    public String getSearchAreaText() {
        return getText(searchAreaText);
    }

    public void clickSearchButton2() {
        click(searchButton2,1);
    }

    public void scrollSearchArea() {
        scrollToBottomWithTimes(9);
    }

    public String getHighlightText() {
        return getText(highlightText);
    }





}
