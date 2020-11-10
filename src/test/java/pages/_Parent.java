package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;


public class _Parent {

    WebDriver driver;
    WebDriverWait wait;

    public _Parent() {
        driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 10);

    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scroolToElement(element);
        element.click();

    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scroolToElement(element);
        element.clear();
        element.sendKeys(value);

    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void scroolToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        //   js.executeScript("window.scrollBy(0,1000)");

    }

    public void verifyElementContainsText(WebElement element, String expectedText) {

        waitUntilVisible(element);
        String actualText = element.getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains(expectedText.toLowerCase()));

    }

    public WebElement randomSelectFromList(List<WebElement> elementsList) {
        return elementsList.get((int)(Math.random() * elementsList.size()));
    }
}
