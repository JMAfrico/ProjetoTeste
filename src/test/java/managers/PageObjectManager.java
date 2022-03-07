package managers;

import org.openqa.selenium.WebDriver;

import com.tricents.pages.InsurantDataPage;
import com.tricents.pages.VehicleDataPage;

public class PageObjectManager {

	private WebDriver driver;
	private VehicleDataPage vehicleDataPage;
	private InsurantDataPage insurantDataPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public VehicleDataPage getVehiclePage(){
		return (vehicleDataPage == null) ? vehicleDataPage = new VehicleDataPage(driver) : vehicleDataPage;
	}
	
	public InsurantDataPage getInsurantDataPagePage(){
		return (insurantDataPage == null) ? insurantDataPage = new InsurantDataPage(driver) : insurantDataPage;
	}
}
