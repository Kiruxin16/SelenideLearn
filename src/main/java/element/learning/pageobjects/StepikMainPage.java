package element.learning.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class StepikMainPage extends StepikPage{

    private final SelenideElement freeCheckBox = $x("//label/span[contains(text(),'Бесплатные')]/..");
    private final SelenideElement searchText=$x("//input[@class='search-form__input ']");

    public void markCheckFreeOn(){
        freeCheckBox.click();
    }
    public void searchCourses(String searchPhrase){
        searchText.sendKeys(searchPhrase);
        searchText.pressEnter();
    }



}
