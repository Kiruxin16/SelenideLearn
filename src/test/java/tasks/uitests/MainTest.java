package tasks.uitests;

import org.junit.jupiter.api.*;
import pageobjects.MainStepicPage;
import tasks.SelenideTestBase;

import static element.learning.util.Url.MAIN_URL;

@DisplayName("Выполнение учебного задания по Selenide")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends SelenideTestBase{
    @BeforeEach
    public void beforeEachTest(){
        mainStepicPage= commonUiSteps.openMain(MAIN_URL);
    }

    @Test
    public void releaseTest(){

    }


}
