package element.learning.steps.checksteps;

import com.codeborne.selenide.Condition;
import element.learning.pageobjects.StepikPage;
import io.qameta.allure.Step;

public class CheckAuthorizationSteps {
    @Step("Проверить что авторизация прошла успешно")
    public void checkAuthorization(StepikPage stepikPage){
        stepikPage.getProfileIcon().should(Condition.exist);
    }
}
