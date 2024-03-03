package steps.uisteps;


import io.qameta.allure.Step;
import pageobjects.MainStepicPage;

import static com.codeborne.selenide.Selenide.open;
/**
*"Шаги реализующие базовый функционал для вохода на страницу и логина"
*/
public class CommonUiSteps {

    @Step("Открыть браузер на стартовой странице ")
    public MainStepicPage openMain(String url){
        return open(url,MainStepicPage.class);
    }

}
