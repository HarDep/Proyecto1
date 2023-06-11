package x.y.z.utils;

import x.y.z.configs.ManagerProperties;

public class UtilProperties {
    static ManagerProperties managerProperties = ManagerProperties.getInstance();

    public static String getConfig(String key){
        return managerProperties.getConfig(key);
    }

    public static String getText(String key){
        return managerProperties.getLanguageText(key);
    }

    public static void setLanguage(String pathFile){
        managerProperties.setLanguage(pathFile);
    }
}
