package steps.checksteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import pageobjects.StepicCoursePage;
import pageobjects.StepikMainPage;
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


}
