package x.y.z.configs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ManagerProperties {
    private Properties configProperties;
    private Properties languageProperties;
    private static ManagerProperties instance = null;

    private ManagerProperties() {
        try {
            FileInputStream fileInputStream = new FileInputStream(GlobalConfigs.PATH_CONFIGS_PROPERTIES);
            FileInputStream fileInputStreamLang = new FileInputStream(GlobalConfigs.PATH_LANGUAGE_SPANISH);
            languageProperties = new Properties();
            configProperties = new Properties();
            configProperties.load(fileInputStream);
            languageProperties.load(fileInputStreamLang);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getConfig(String key) {
        return configProperties.getProperty(key);
    }

    public String getLanguageText(String key){
        return languageProperties.getProperty(key);
    }

    public void setLanguage(String pathLanguageFile){
        try {
            FileInputStream languageStream = new FileInputStream(pathLanguageFile);
            languageProperties = new Properties();
            languageProperties.load(languageStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ManagerProperties getInstance() {
        if (instance == null)
            instance = new ManagerProperties();
        return instance;
    }
}
