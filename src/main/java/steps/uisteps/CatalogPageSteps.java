package steps.uisteps;

import io.qameta.allure.Step;
import pageobjects.StepikCatalogPage;

public class CatalogPageSteps {
    @Step("Нажать на название курса ''Поколение Python': курс для начинающих'")
    public void goToPythonCoursePage(StepikCatalogPage stepikCatalogPage){
        stepikCatalogPage.pushToPythonCourseText();

    }
}
