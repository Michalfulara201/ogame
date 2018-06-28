import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.IndexPage;
import scenarios.LoginScenario;

public class ServerTests extends MainTest {




    @Test

    public void shouldLoginToProperServer(){
        indexPage.run(new LoginScenario("testtestest23@gmail.com","123456789"))
                .chooseServerfromList()
                .serverAssertions.isLoggedToAccountPage();





    }

}
