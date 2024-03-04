package pageobjects;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class StepicCoursePage {
    private final SelenideElement joinCourseButton=$x("//button[text()='Поступить на курс']");
    private final SelenideElement freeTextLabel=$x("//span[text()='Бесплатно']");
}
