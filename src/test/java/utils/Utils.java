package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	
	public static ChromeDriver driver;
	
	public static void acessarSistema() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.home")+ "/driver/chromedriver.exe");
		
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	}

}
