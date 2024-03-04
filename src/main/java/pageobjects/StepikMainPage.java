package pageobjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import static com.codeborne.selenide.Selenide.$x;


public class StepikMainPage extends StepikPage{

    private final SelenideElement freeCheckBox = $x("//label/span[contains(text(),'Бесплатные')]/..");

    public void markCheckFreeOn(){
        freeCheckBox.click();
    }



}
