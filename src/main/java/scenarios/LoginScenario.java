package scenarios;

import pages.ServersPage;
import pages.IndexPage;

public class LoginScenario implements Scenario <IndexPage, ServersPage>{





    private String login;
    private String password;





    public LoginScenario(String login, String password) {


        this.login=login;
        this.password=password;
    }



    @Override
    public ServersPage run(IndexPage entry) {
        return entry.openOgamePage()
                .loginButtonOnPage()
                .setYourEmailToLogin(login)
                .setYourPasswordToLogin(password)
                .clickLoginInButton();
    }
}
