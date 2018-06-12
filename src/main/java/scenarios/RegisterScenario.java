package scenarios;

import pages.ServersPage;
import pages.IndexPage;

public class RegisterScenario implements Scenario<IndexPage, ServersPage> {


    private String login;
    private String password;


    public RegisterScenario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public ServersPage run(IndexPage entry) {
        return entry.openOgamePage()

                .setYourEmail(login)
                .setYourPassword(password)
                .clickOnRegisterButton();



    }
}
