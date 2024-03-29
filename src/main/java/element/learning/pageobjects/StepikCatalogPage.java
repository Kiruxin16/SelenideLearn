package element.learning.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$x;



public class StepikCatalogPage extends StepikPage{
    private final SelenideElement pythonCourseElement=$x("//a[@aria-label='\"Поколение Python\": курс для начинающих']");
    @Getter
    private final ElementsCollection searchResult= $$x("//li[@class='course-cards__item']");

    public void pushToPythonCourseText(){
        pythonCourseElement.click();
    }



}
