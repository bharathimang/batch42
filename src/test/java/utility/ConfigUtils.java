package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigUtils {
	
	public static String readConfigData(String key) throws Throwable {
		
		File file=new File("src/test/resources/Configurations/Settings.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
		
	}
	
	public void writeConfigData() {
		
	}

}
