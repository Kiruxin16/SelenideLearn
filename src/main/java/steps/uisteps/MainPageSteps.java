package steps.uisteps;

import io.qameta.allure.Step;
import pageobjects.StepikCatalogPage;
import pageobjects.StepikMainPage;

public class MainPageSteps {
    @Step("Кликнуть чек-бокс 'Бесплатные'")
    public void goToCatalogSearch(StepikMainPage stepikMainPage){
        stepikMainPage.markCheckFreeOn();
    }
}
