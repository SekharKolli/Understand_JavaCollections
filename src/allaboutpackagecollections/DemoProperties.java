/*
 * Purpose : Learn about properties collection
 * It has to have an extension of .properties
 * Date: 11-January-2019
 */

package allaboutpackagecollections;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {

	public static void main(String[] args) {

		File fin = new File(
				"C:\\Users\\SekharMaster\\Documents\\MyJavaFiles_Edureka\\Understand_JavaCollections\\src\\allaboutpackagecollections\\ListOfProperties.properties");

		try (InputStream isRef = new FileInputStream(fin)) {

			Properties prop = new Properties();
			prop.load(isRef);
			
//			Entry<String, String> args = prop.entrySet();
/*
 * for (String string : args) {
 * System.out.println();
 * }
 */
			
			// Rules : 1\ Keys case-sensitive. 2\ Keys cannot have spaces 
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("email" )); // Email works
			System.out.println(prop.getProperty("course")); // String with spaces are coming with string with spaces
			System.out.println(prop.getProperty("RandomNO")); // Int value appear to be coming as text
			System.out.println(prop.getProperty("sql_Stmt")); // Value can be a long string 
			System.out.println(prop.getProperty("fiber")); // Float value appears to be coming as text
			System.out.println(prop.getProperty("Dob")); // Date is being read as text
			System.out.println(prop.getProperty("newLine")); // Newline is being treated as new line
			System.out.println(prop.getProperty("SpecialChar")); // Able to read special chars
			System.out.println(prop.getProperty("null")); // Null Seems to be allowed
			
			System.out.println("-----Reading using a foreach loop-----");
			Set s = prop.keySet();
			for (Object obj : s) {
				System.out.println(prop.getProperty((String) obj));
			}
			
		} catch (IOException e) {
			System.out.println("Unable to find ListOfProperties.properties in the src folder");
			e.printStackTrace();
		}

	}

}
