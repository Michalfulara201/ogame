import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import scenarios.LoginScenario;

public class LoginTests extends MainTest {



    @Test

   public void shouldLogIn(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","123456789"))
                .loginAssertion.isUserLoggedIn();

    }
    @Test
    public void shouldNotLogInWithWrongPassword(){
        indexPage.run(new LoginScenario("testtestest@gmail.com","1289"))
                .loginAssertion.userNotLoggedwithWrongPassword();
    }
    @Test
    public void shouldNotLogInWithoutLogin(){
        indexPage.run(new LoginScenario("","123456789"))
                .loginAssertion.userNotLoggedwithWrongLoggin();
    }


}
