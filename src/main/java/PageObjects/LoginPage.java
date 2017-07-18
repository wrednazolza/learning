package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Page{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage open() {
        driver.get("https://wrednazolzaautomatyzacja.wordpress.com/wp-admin");
        return this;
    }

    public void tryToLogIn(String Login, String Haslo){
        driver.findElement(By.name("log")).sendKeys(Login);
        driver.findElement(By.name("pwd")).sendKeys(Haslo);
        driver.findElement(By.name("wp-submit")).click();
    }

    public DashboardPage logIn() {
        tryToLogIn("wrednazolzaautomatyzacja","prostehaslo123");
        return new DashboardPage(driver);
    }


}
