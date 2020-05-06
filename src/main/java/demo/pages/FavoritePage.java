package demo.pages;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

public class FavoritePage {
    public String getTitle() {
        AndroidElement titleArticle = AndroidDriverInstance.androidDriver.findElement(By.id("toolbar_bar_favourite"));
        String title = titleArticle.getText();
        return title;
    }

    public boolean isOnPage() {
        WebDriverWait wait = new WebDriverWait(androidDriver, 5);
        WebElement favouriteLabel = wait
                .until(ExpectedConditions.presenceOfElementLocated(By.id("toolbar_bar_favourite")));
        return favouriteLabel.isDisplayed();
    }

    public void addItem(String itemName){
        String xpath = "//android.widget.TextView[contains(@resource-id, 'grid_favourite_name') and @text = '%s']";
        AndroidDriverInstance.androidDriver.findElement(By.xpath(String.format(xpath, itemName))).click();
    }

    public void checkoutButton(){
        WebElement checkoutButton = AndroidDriverInstance.androidDriver.findElement(By.id("checkoutButton"));
        checkoutButton.click();
    }

    public void suggestedamountButton(){
        WebElement suggestedButton = AndroidDriverInstance.androidDriver.findElement(By.id("cash_suggest_lowest"));
        suggestedButton.click();
    }

    public void okButton(){
        WebElement okButton = AndroidDriverInstance.androidDriver.findElement(By.id("tablet_ok_button"));
        okButton.click();
    }

    public void nosendButton(){
        WebElement nosendButton = AndroidDriverInstance.androidDriver.findElement(By.id("no_send_button"));
        nosendButton.click();
    }

    public void amountInput(String keyword){
        WebElement amountInput = AndroidDriverInstance.androidDriver.findElement(By.id("cash_edit_text"));
        amountInput.sendKeys(keyword);
    }
}
