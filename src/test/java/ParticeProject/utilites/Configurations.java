package ParticeProject.utilites;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configurations {

    public static String setValue (String key) throws FileNotFoundException {

        FileReader fileReader = new FileReader("config.properties");
        Properties p = new Properties();
        try {
            p.load(fileReader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
String value = p.getProperty(key);
 return value;
    }
}
