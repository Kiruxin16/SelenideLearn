package steps.uisteps;


import io.qameta.allure.Step;
import pageobjects.StepikMainPage;

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

}
