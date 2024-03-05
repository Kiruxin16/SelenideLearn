package element.learning.steps.uisteps;

import io.qameta.allure.Step;
import element.learning.pageobjects.StepikMainPage;

public class MainPageSteps {
    @Step("Кликнуть чек-бокс 'Бесплатные'")
    public void goToCatalogSearch(StepikMainPage stepikMainPage){
        stepikMainPage.markCheckFreeOn();
    }


    @Step("Произвести поиск курсов по введенному тексту 'Java'")
    public void startCourseSearch(StepikMainPage stepikMainPage, String searchPhrase){
        stepikMainPage.searchCourses(searchPhrase);
    }

    @Step("Нажать кнопку 'Войти'")
    public void startAuthentication(StepikMainPage stepikMainPage){
        stepikMainPage.loginButtonClick();
    }
}
