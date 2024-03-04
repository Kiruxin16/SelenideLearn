package pageobjects;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class StepikPage {
    private final SelenideElement loginButton = $x("//a[text()='Войти']");
}
