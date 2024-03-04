package tasks;

import steps.checksteps.CheckElementsExistsSteps;
import steps.uisteps.CatalogPageSteps;
import steps.uisteps.CommonUiSteps;
import steps.uisteps.MainPageSteps;


public abstract class TestBase {
    protected CommonUiSteps commonUiSteps= new CommonUiSteps();
    protected MainPageSteps mainPageSteps =new MainPageSteps();
    protected CatalogPageSteps catalogPageSteps = new CatalogPageSteps();
    protected CheckElementsExistsSteps checkElementsExistsSteps =new CheckElementsExistsSteps();
}
