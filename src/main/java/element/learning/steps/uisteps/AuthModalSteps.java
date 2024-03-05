package element.learning.steps.uisteps;

import io.qameta.allure.Step;
import element.learning.pageobjects.StepikMainPage;
import static element.learning.util.Constants.CREDENTIALS;

public class AuthModalSteps {
    @Step("Заполнить поля логина пароля нажать войти")
    public void performAuthorization(StepikMainPage stepikMainPage){
        stepikMainPage.loginFormInput(CREDENTIALS.getLogin());
        stepikMainPage.passwordFormInput(CREDENTIALS.getPassword());
        stepikMainPage.autButtonClick();
    }

}
