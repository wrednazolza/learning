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
        driver.findElement(By.name("usernameOrEmail")).sendKeys(Login);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.name("password")).sendKeys(Haslo);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    public DashboardPage logIn() {
        tryToLogIn("wrednazolzaautomatyzacja","wrednehaslo123");
        return new DashboardPage(driver);
    }

    public boolean isOpen() {
        return driver.findElement(By.xpath("//div[@class='login__form-header']")).isDisplayed();
    }


    public boolean isPasswordErrorDisplayed() {
       return driver.findElement(By.xpath("//div[@class='form-input-validation is-error']")).isDisplayed();
    }

   /*public boolean isPasswordErrorDisplayed() {
        return driver.findElement(By.xpath("//div[text()='Oops, that\'s not the right password. Please try again!']")).isDisplayed();
    }
    */

}
