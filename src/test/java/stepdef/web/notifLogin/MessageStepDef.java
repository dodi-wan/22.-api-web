package stepdef.web.notifLogin;

import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.web.notifLogin.MessagePages;

public class MessageStepDef {

    private final MessagePages messagePages;

    public MessageStepDef(){
        messagePages = new MessagePages();
    }


    @Then("message login {string}")
    public void messageLogin(String message) {
        messagePages.wrongUsername(message);

        String actualMessage = messagePages.messageError(message);
        Assertions.assertEquals(actualMessage, message);
    }
}
