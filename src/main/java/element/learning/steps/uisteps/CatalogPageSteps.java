package element.learning.steps.uisteps;

import io.qameta.allure.Step;
import element.learning.pageobjects.StepikCatalogPage;

public class CatalogPageSteps {
    @Step("Нажать на название курса ''Поколение Python': курс для начинающих'")
    public void goToPythonCoursePage(StepikCatalogPage stepikCatalogPage){
        stepikCatalogPage.pushToPythonCourseText();

    }
}
