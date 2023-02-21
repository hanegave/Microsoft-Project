package GenericLiberaries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * This class contains all reusable method to perform operations on properties
 * file
 * 
 * @author Vaibhav
 *
 */

public class PropertiesFileUtility {
	Properties property;

	/**
	 * this method is used to initalize the property file
	 * 
	 * @param filePath
	 */

	public void PropertyFileInitialization(String filePath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	public String FetchProperty(java.lang.String key) {
		return property.getProperty(key);

	}
}
