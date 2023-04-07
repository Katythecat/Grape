package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     public static Properties properties;
    public static Properties readFileProperty() throws IOException {
        FileInputStream file=new FileInputStream("src/test/resources/Config/Config.properties");
        properties=new Properties();
        properties.load(file);

        return properties;
    }

    public static String getValueOfProp(String valueKey){
        return properties.getProperty(valueKey);

    }


}
