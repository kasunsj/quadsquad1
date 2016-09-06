package datamanagement; // it is the main folder where all over files exists
import java.util.*; // importing util package from java 
import java.io.*; //importing io package of java

public class AppProperties 
{
private static AppProperties self = null;
private Properties properties;

public static AppProperties getInstance() 
{
if (self == null ) { self = new AppProperties(); 
} 
return self;
}
private AppProperties() 
{
	properties = new Properties();
try 
{
	properties.load(new FileInputStream("Properties.prop"));
} 
catch (IOException e) 
{
	throw new RuntimeException("Could not read property file");
}
}
    public Properties getProperties() 
    {
    	return properties;
}
    }
