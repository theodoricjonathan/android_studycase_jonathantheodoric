package demo.pages;

import static demo.webdriver.AndroidDriverInstance.androidDriver;

import demo.webdriver.AndroidDriverInstance;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartPage {

  public boolean isOnPage() {
    WebDriverWait wait = new WebDriverWait(androidDriver, 30);
    WebElement signInLabel = wait
        .until(ExpectedConditions.presenceOfElementLocated(By.id("alreadySignInTextView")));
    return signInLabel.isDisplayed();
  }

  public void clikSignInButton() {
    Point coord = androidDriver.findElement(By.id("alreadySignInTextView"))
        .getCenter();
    TouchAction touchAction = new TouchAction(androidDriver);
    touchAction.tap(PointOption.point(coord.getX() + 200, coord.getY())).perform();
  }

  public void usernameInput(String keyword){
    WebElement userInput = AndroidDriverInstance.androidDriver.findElement(By.id("emailOrPhoneEditText"));
    userInput.sendKeys(keyword);
  }

  public void passwordInput(String keyword){
    WebElement passInput = AndroidDriverInstance.androidDriver.findElement(By.id("passwordEditText"));
    passInput.sendKeys(keyword);
  }

  public void signinButton(){
    WebElement loginButton = AndroidDriverInstance.androidDriver.findElement(By.id("signInButton"));
    loginButton.click();
  }


}
