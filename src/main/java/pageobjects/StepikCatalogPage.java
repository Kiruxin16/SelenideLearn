package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.*;


public class StepikCatalogPage extends StepikPage{
    private final SelenideElement pythonCourseElement=$x("//a[@aria-label='\"Поколение Python\": курс для начинающих']");
    private final SelenideElement searchText=$x("//input[@class='search-form__input ']");

    @Getter
    private final ElementsCollection searchResult= $$x("//ul[contains(@class,'course-cards')]/li");

    public void pushToPythonCourseText(){
        pythonCourseElement.click();
    }
}
