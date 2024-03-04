package steps.checksteps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pageobjects.StepikCatalogPage;

public class CompareResultsSteps {
    @Step("Сравнение результатов поиска. Проверить у всех ли курсов на странице в названии имеется введеный тек")
    public void compareSearchResult(StepikCatalogPage stepikCatalogPage,String textPhrase){
        for(SelenideElement element:stepikCatalogPage.getSearchResult()){
            element.should(Condition.text(textPhrase));
        }
    }

}
