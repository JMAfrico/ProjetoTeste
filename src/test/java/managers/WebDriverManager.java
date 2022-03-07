package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Classe responsável por gerenciar o driver
 */
public class WebDriverManager {

	private WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() {
		
	}

	/**
	 * Método faz a chamada para a criação de um novo driver caso este não exista, ou retorna o drive caso já exista
	 * @return driver
	 */
	public WebDriver getDriver() {
		if (driver == null) {
			driver = createDriver();
		}
		return driver;
	}

	/**
	 * Método cria um novo driver
	 * @return driver
	 */
	private WebDriver createDriver() {
			driver = createLocalDriver();
			return driver;
	}

	/**
	 * Método responsavel pelas propriedades do driver a ser criado
	 * @return driver
	 */
	private WebDriver createLocalDriver() {
		System.setProperty(CHROME_DRIVER_PROPERTY, System.getProperty("user.dir")+"/libs/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().getPageLoadTimeout();
		return driver;
	}

	/**
	 * Método finaliza o driver caso esteja sendo executado
	 */
	public void closeDriver() {
		if(driver != null) {
			driver.quit();
		}		
	}
}
