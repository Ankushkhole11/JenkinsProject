package Demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void test1Test() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./data/property.properties");
		Properties p = new Properties();
				p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		System.out.println("welcome to jenkins");
	}

}
