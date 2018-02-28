package SeleniumTests;

import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoginTest extends SeleniumTest {

    @Test
    public void ShouldBePossibleToLogInWithCorrectCredentials() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        DashboardPage dp = lp.logIn();

        assertTrue(dp.isOpen());
    }

    @Test
    public void ShouldNotBePossibleToLogInWithWrongPassword() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        lp.tryToLogIn("wrednazolzaautomatyzacja","blednehaslo");

        assertTrue(lp.isOpen());
        assertTrue(lp.isErrorDisplayed());

       /* assertTrue(lp.isPasswordErrorDisplayed()); */

    }

    @Test
    public void ShouldNotBePossibleToLogInWithWrongUsername() {
        LoginPage lp = new LoginPage(driver);
        lp.open();
        lp.tryToEnterUsername("blednyusername");

        assertTrue(lp.isOpen());
        assertTrue(lp.isUserErrorDisplayed());
    }


}
