package managers;

import org.openqa.selenium.WebDriver;
import com.tricents.pages.VehicleDataPage;

public class PageObjectManager {

	private WebDriver driver;
	private VehicleDataPage vehicleDataPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public VehicleDataPage getCotacaoPage(){
		return (vehicleDataPage == null) ? vehicleDataPage = new VehicleDataPage(driver) : vehicleDataPage;
	}
}
