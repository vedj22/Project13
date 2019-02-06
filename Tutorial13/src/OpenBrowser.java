import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/PC User1/Desktop/SeleniumFiles/Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	   driver.getCurrentUrl();
		
		
		driver.quit();
		

	}

}
