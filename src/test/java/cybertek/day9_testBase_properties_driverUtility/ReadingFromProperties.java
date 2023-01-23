package cybertek.day9_testBase_properties_driverUtility;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void reading_properties_file() throws IOException {
        //Properties class object allows us
        //to read form configuration.properties
        Properties properties=new Properties();

        //We need to show where the file is stored.
        //we need the path of the file
        String path="configuration.properties";

        //we need to open this configuration.properties file in java memory
        FileInputStream file=new FileInputStream(path);
        //we need to load  the opened file into the properties object
        properties.load(file);

        //we can read the configuration.properties file using properties object
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"usrname\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));

    }
}
