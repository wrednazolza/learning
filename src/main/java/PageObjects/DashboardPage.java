package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends Page {

    protected DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpen() {
        return driver.findElement(By.linkText("Site Stats")).isDisplayed();
    }
}
