package element.learning.util;


import java.io.IOException;
import java.util.Properties;

import static element.learning.util.Constants.MAIN_URL;

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

    public static String getMainUrl(String name) {
        if (!isPropertiesRead) {
            getProperties();
        }
        return PROPERTIES.getProperty(MAIN_URL);
    }
}
