package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	private WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() {
		
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	private WebDriver createDriver() {
			driver = createLocalDriver();
			return driver;
	}

	private WebDriver createLocalDriver() {
		System.setProperty(CHROME_DRIVER_PROPERTY, System.getProperty("user.dir")+"/libs/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		return driver;
	}

	public void closeDriver() {
		driver.quit();
	}
}
