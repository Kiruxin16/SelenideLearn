package element.learning.pageobjects;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;


public class StepikPage {
    @Getter
    private final SelenideElement loginButton = $x("//a[text()='Войти']");
    @Getter
    private final SelenideElement authModal =$x("//div[@class='light-tabs ember-view']");
    @Getter
    private final SelenideElement profileIcon =$x("//img[@class='navbar__profile-img']");
    private final SelenideElement loginForm =$x("//input[@name='login']");
    private final SelenideElement passwordForm =$x("//input[@name='password']");
    private final SelenideElement authButton =$x("//button[@type='submit']");
    private final SelenideElement profileButton =$x("//button[@aria-label='Profile']");
    private final SelenideElement logoutButton =$x("//button[text()='Выход']");
    private final SelenideElement confirmButton =$x("//footer[contains(@class,'modal-popup__footer')]/button[text()='OK']");


    public void loginButtonClick(){
        loginButton.click();
    }
    public void loginFormInput(String login){
        loginForm.sendKeys(login);
    }
    public void passwordFormInput(String password){
        passwordForm.sendKeys(password);
    }
    public void autButtonClick(){
        authButton.click();
    }
    public void profileButtonClick(){
        profileButton.click();
    }
    public void logoutButtonClick(){
        logoutButton.click();
    }
    public void clickConfirmButton(){
        confirmButton.click();
    }









}
