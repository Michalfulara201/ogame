import org.testng.annotations.Test;
import scenarios.RegisterScenario;

public class RegistrationTests extends MainTest {


    @Test

    public void shouldNotRegister(){
        indexPage.run(new RegisterScenario("testtestt@gmail.com","123456789"))
                .registerAssertions.isUserRegistered();



    }

    @Test
    public void shouldRegister(){
        indexPage.run(new RegisterScenario("testtestt2@gmail.com","123456789"))
                .loginAssertion.isUserLoggedIn();
    }
}
