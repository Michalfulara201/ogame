import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scenarios.LoginScenario;

public class LoginTests extends MainTest {



    @Test(priority = 1)

   public void shouldLogIn(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","123456789"))
                .loginAssertion.isUserLoggedIn();

    }
    @Test(priority = 2)
    public void shouldNotLogInWithWrongPassword(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","1289"))
                .loginAssertion.userNotLoggedwithWrongPassword();
    }
    @Test(priority = 3)
    public void shouldNotLogInWithoutLogin(){
        indexPage.run(new LoginScenario("","123456789"))
                .loginAssertion.userNotLoggedwithWrongLoggin();
    }


}
