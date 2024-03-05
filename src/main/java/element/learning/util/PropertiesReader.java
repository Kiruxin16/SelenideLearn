package element.learning.util;


import element.learning.model.Credentials;

import java.io.IOException;
import java.util.Properties;

import static element.learning.util.Constants.LOGIN;
import static element.learning.util.Constants.MAIN_URL_NAME;
import static element.learning.util.Constants.PASSWORD;

public class PropertiesReader {

    private static final Properties PROPERTIES = new Properties();
    private static boolean isPropertiesRead;


    public static void getProperties() {
        try {
            PROPERTIES.load(ClassLoader.getSystemResource("stand.properties").openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        isPropertiesRead = true;
    }

    public static String getMainUrl() {
        if (!isPropertiesRead) {
            getProperties();
        }
        return PROPERTIES.getProperty(MAIN_URL_NAME);
    }

    public static Credentials getCredentials(){
        if(!isPropertiesRead){
            getProperties();
        }
        return new Credentials(PROPERTIES.getProperty(LOGIN), PROPERTIES.getProperty(PASSWORD));
    }


}
