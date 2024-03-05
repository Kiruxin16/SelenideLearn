package element.learning.steps.checksteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import element.learning.pageobjects.StepicCoursePage;
import element.learning.pageobjects.StepikMainPage;
public class CheckElementsExistsSteps {

    @Step("Проверить есть ли на странице кнопка войти")
    public void checkLoginButtonExist(StepikMainPage stepikMainPage){
        stepikMainPage.getLoginButton().should(Condition.exist);
    }

    @Step("Проверить есть ли на странице курса кнопки 'Бесплатно' и 'Поступить на курс'")
    public void checkCourseElements(StepicCoursePage stepicCoursePage){
        stepicCoursePage.getJoinCourseButton().should(Condition.exist);
        stepicCoursePage.getFreeTextLabel().should(Condition.exist);

    }

    @Step("Проверить существует ли модальное окно для авторизации")
    public void checkAuthModal(StepikMainPage stepikMainPage){
        stepikMainPage.getAuthModal().should(Condition.exist);
    }


}
