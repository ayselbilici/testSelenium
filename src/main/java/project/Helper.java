package project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;


public class Helper {

    protected WebDriver webDriver;

    public Helper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void click(By byElement, int timeOut) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).click();
    }

    public void scrollToBottomWithTimes(int times) {

        for (int i = 0; i < times; i++) {
            JavascriptExecutor js = ((JavascriptExecutor) webDriver);
            js.executeScript("window.scrollBy(0,200)");
            waitSecond(1);
        }
    }

    public void waitByMilliSeconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitSecond(int second) {
        waitByMilliSeconds(second * 1000L);
    }

    public void chromeFocusLastTab() {
        ArrayList<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(tabs.size() - 1));
    }

    public String getText(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();
    }

    public String getURL() {
        return webDriver.getCurrentUrl();
    }

    public void sendText(By byElement,String text){
        webDriver.findElement(byElement).sendKeys(text);
    }


}
