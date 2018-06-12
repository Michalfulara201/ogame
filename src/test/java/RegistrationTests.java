import org.testng.annotations.Test;
import scenarios.RegisterScenario;

public class RegistrationTests extends MainTest {


    @Test(priority = 2)

    public void shouldNotRegister(){
        indexPage.run(new RegisterScenario("testtestt@gmail.com","123456789"))
                .registerAssertions.isUserRegistered();



    }

    @Test(priority = 1)
    public void shouldRegister(){
        indexPage.run(new RegisterScenario("testtestt2@gmail.com","123456789"))
                .loginAssertion.isUserLoggedIn();
    }
}
