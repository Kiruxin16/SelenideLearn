package element.learning.util;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import element.learning.model.Credentials;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    public static final String MAIN_URL_NAME = "main_url";
    public static final String JAVA_SEARCH = "Java";
    public static final String LOGIN ="login";
    public static final String PASSWORD = "password";
    public static final Credentials CREDENTIALS = PropertiesReader.getCredentials();



}
