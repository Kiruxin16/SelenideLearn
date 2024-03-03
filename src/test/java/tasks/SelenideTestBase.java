package tasks;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import pageobjects.MainStepicPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.closeWindow;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class SelenideTestBase extends TestBase {
    protected MainStepicPage mainStepicPage = new MainStepicPage();
    @BeforeAll
    @Step("Настройка браузера")
    public void setUpBeforeEach(){
        Configuration.browserSize = "1440x900";
    }

    @AfterEach
    @Step ("Выключение браузера")
    public void tearDownAfterEach(){
        closeWindow();
        closeWebDriver();
    }

}