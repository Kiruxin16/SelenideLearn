package steps.uisteps;

import io.qameta.allure.Step;
import pageobjects.StepikMainPage;
import static element.learning.util.Constants.JAVA_SEARCH;

public class MainPageSteps {
    @Step("Кликнуть чек-бокс 'Бесплатные'")
    public void goToCatalogSearch(StepikMainPage stepikMainPage){
        stepikMainPage.markCheckFreeOn();
    }


    @Step("Произвести поиск курсов по введенному тексту 'Java'")
    public void startCourseSearch(StepikMainPage stepikMainPage, String searchPhrase){
        stepikMainPage.searchCourses(searchPhrase);
    }
}
