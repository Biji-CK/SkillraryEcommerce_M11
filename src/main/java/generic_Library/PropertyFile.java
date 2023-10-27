package generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	public String getPropertyData(String key) throws Throwable
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
		
	}
	

}
