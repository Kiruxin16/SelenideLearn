package element.learning.steps.uisteps;


import com.codeborne.selenide.Condition;
import element.learning.pageobjects.StepikPage;
import io.qameta.allure.Step;
import element.learning.pageobjects.StepikMainPage;

import static com.codeborne.selenide.Selenide.open;
/**
*"Шаги реализующие базовый функционал для вохода на страницу и логина"
*/
public class

CommonUiSteps {

    @Step("Открыть браузер на стартовой странице ")
    public StepikMainPage openMain(String url){
        return open(url, StepikMainPage.class);
    }

    @Step("Разлогиниться")
    public void logOut(StepikPage stepikPage){
        if(stepikPage.getProfileIcon().is(Condition.exist)){
            stepikPage.profileButtonClick();
            stepikPage.logoutButtonClick();
            stepikPage.clickConfirmButton();
        }

    }

}
