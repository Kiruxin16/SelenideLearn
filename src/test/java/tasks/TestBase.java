package tasks;

import element.learning.steps.checksteps.CheckAuthorizationSteps;
import element.learning.steps.checksteps.CheckElementsExistsSteps;
import element.learning.steps.checksteps.CompareResultsSteps;
import element.learning.steps.uisteps.AuthModalSteps;
import element.learning.steps.uisteps.CatalogPageSteps;
import element.learning.steps.uisteps.CommonUiSteps;
import element.learning.steps.uisteps.MainPageSteps;


public abstract class TestBase {
    protected CommonUiSteps commonUiSteps= new CommonUiSteps();
    protected MainPageSteps mainPageSteps =new MainPageSteps();
    protected CatalogPageSteps catalogPageSteps = new CatalogPageSteps();
    protected CheckElementsExistsSteps checkElementsExistsSteps =new CheckElementsExistsSteps();
    protected CompareResultsSteps compareResultsSteps = new CompareResultsSteps();
    protected AuthModalSteps authModalSteps = new AuthModalSteps();
    protected CheckAuthorizationSteps checkAuthorizationSteps = new CheckAuthorizationSteps();
}
