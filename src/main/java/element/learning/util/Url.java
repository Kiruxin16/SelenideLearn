package element.learning.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.swing.plaf.PanelUI;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Url {

    public static final String MAIN_URL = PropertiesReader.getMainUrl();
}
