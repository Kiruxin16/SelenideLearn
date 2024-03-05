package tasks.uitests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import tasks.SelenideTestBase;
import static element.learning.util.Url.MAIN_URL;
import static element.learning.util.Constants.JAVA_SEARCH;

@DisplayName("Выполнение учебного задания по Selenide")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest extends SelenideTestBase{
    @BeforeEach
    public void beforeEachTest() {
        //Перед запуском тестов открыть браузер на странице https://stepik.org/catalog
        stepikMainPage=commonUiSteps.openMain(MAIN_URL);
    }

    @Test
    @Order(1)
    @DisplayName("Провека наличия на странице кнопки войти")
    public void testCheckButtonExists(){
        //Шаг проверки наличия кнопки "войти"
        checkElementsExistsSteps.checkLoginButtonExist(stepikMainPage);
    }

    @Test
    @Order(2)
    @DisplayName("Проверка наличия кнопок 'Бесплатно' и  'Поступить на курс' на странице курса")
    public void testCheckCourseButtonsExists(){
        //Шаг входа на страницу таблицы поиска в каталоге
        mainPageSteps.goToCatalogSearch(stepikMainPage);
        //Шаг выбора курса с названием "'Поколение Python': курс для начинающих" (старый курс неактуален)
        catalogPageSteps.goToPythonCoursePage(stepikCatalogPage);
        //Шаг проверки наличия текста 'Бесплатно' и кнопки 'Поступить на курс' на открывшейся странице
        checkElementsExistsSteps.checkCourseElements(stepicCoursePage);


    }
    @Test
    @Order(3)
    @DisplayName("Проверка результатов поиска курсов по Запросу Java")
    public void testCheckSearchResult(){
        //Шаг поиска по запросу Java
        mainPageSteps.startCourseSearch(stepikMainPage,JAVA_SEARCH);
        //Шаг сравнения результатов с фразой из поиска
        compareResultsSteps.compareSearchResult(stepikCatalogPage,JAVA_SEARCH);

    }

    @Test
    @Order(4)
    @DisplayName("Проверка авторизации")
    public void testAuthCheck(){
        //Шаг нажатия на кноку 'Войти'
        mainPageSteps.startAuthentication(stepikMainPage);
        //Шаг проверки открытия окна аутентификации
        checkElementsExistsSteps.checkAuthModal(stepikMainPage);
        //Шаг выполнения аутентификации
        authModalSteps.performAuthorization(stepikMainPage);
        //Шаг провеки что авторизация прошла
        checkAuthorizationSteps.checkAuthorization(stepikMainPage);

    }


    @AfterEach
    public void logOut(){
        //Шаг выхода из профиля
        commonUiSteps.logOut(stepikMainPage);
    }

}
