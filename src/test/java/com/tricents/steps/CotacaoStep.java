package com.tricents.steps;

import org.openqa.selenium.WebDriver;
import com.tricents.pages.BrowserFactory;
import com.tricents.pages.CotacaoPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
//import org.openqa.selenium.JavascriptExecutor;

public class CotacaoStep {

	BrowserFactory browser;
	WebDriver driver;
	CotacaoPage cotacaoPage;
	Scenario cenario;
	//JavascriptExecutor js;
			
	public CotacaoStep() {
		driver = BrowserFactory.getChromeDriver();
		cotacaoPage = new CotacaoPage(driver);
		//js = (JavascriptExecutor)driver;
	}
	
	@Before
	public void setup(Scenario cenario) {
		this.cenario = cenario;
		System.out.println("-------------INICIANDO AUTOMAÇÃO----------");	
		System.out.println("*****TAG: "+cenario.getSourceTagNames());	
		System.out.println("*****CENARIO: "+cenario.getName());		
		System.out.println("-------------------------------------------");
	}
	
	@Dado("que estou no site de cotacao")
	public void que_estou_no_site_de_cotacao() {
		cotacaoPage.verificoQueEstouNoSiteDeCotacao();
	}

	@Quando("seleciono a marca do veiculo {string}")
	public void seleciono_a_marca_do_veiculo(String marca) {
		cotacaoPage.getSelectMake().sendKeys(marca);
	}

	@Quando("digito a forca do motor do veiculo {string} KW")
	public void digito_a_forca_do_motor_do_veiculo_kw(String forca) {
		cotacaoPage.getTxtEnginePerform().sendKeys(forca);
	}

	@Quando("seleciono a data de fabricacao do veiculo {string}")
	public void seleciono_a_data_de_fabricacao_do_veiculo(String data) {
		cotacaoPage.getTxtDateofManufacture().sendKeys(data);
	}

	@Quando("seleciono o numero de assentos do veiculo {string}")
	public void seleciono_o_numero_de_assentos_do_veiculo(String numeroAssentos) {
		//js.executeScript("arguments[0].scrollIntoView(true);", cotacaoPage.getSelectNumberofSeats().isDisplayed());
		cotacaoPage.getSelectNumberofSeats().sendKeys(numeroAssentos);
	}

	@Quando("seleciono o tipo de combustivel do veiculo {string}")
	public void seleciono_o_tipo_de_combustivel_do_veiculo(String tipoCombustivel) {
		cotacaoPage.getSelectFuelType().sendKeys(tipoCombustivel);
	}

	@Quando("digito o preco de tabela do veiculo {string}")
	public void digito_o_preco_de_tabela_do_veiculo(String precoTabela) {
		cotacaoPage.getTxtListPrice().sendKeys(precoTabela);
	}

	@Quando("digito o numero da placa do veiculo {string}")
	public void digito_o_numero_da_placa_do_veiculo(String placa) {
		cotacaoPage.getTxtLicensePlateNumber().sendKeys(placa);
	}

	@Quando("digito a quilometragem do veiculo {string}")
	public void digito_a_quilometragem_do_veiculo(String quilometragem) {
		cotacaoPage.getTxtAnnualMileage().sendKeys(quilometragem);
	}

	@Quando("clico em next")
	public void clico_em_next() {
		cotacaoPage.getBtnNext().click();
	}
	
	@Quando("seleciono a modelo do veiculo {string}")
	public void seleciono_a_modelo_do_veiculo(String modelo) {
		cotacaoPage.getSelectModel().sendKeys(modelo);
	}

	@Quando("digito a cilindrada do veiculo {string} ccm")
	public void digito_a_cilindrada_do_veiculo_ccm(String cilindradas) {
		cotacaoPage.getTxtCylinderCapacity().sendKeys(cilindradas);
	}

	@Quando("seleciono a opcao de motorista conduz pelo lado direito")
	public void seleciono_a_opcao_de_motorista_conduz_pelo_lado_direito() {
		cotacaoPage.getSelectRightHandDrive().click();
	}

	@Quando("seleciono o numero de assentos do lado do motorista {string}")
	public void seleciono_o_numero_de_assentos_do_lado_do_motorista(String assentosMotorista) {
		cotacaoPage.getSelectNumberofSeatsMotorcycle().sendKeys(assentosMotorista);
	}

	@Quando("digito a carga util do veiculo {string}")
	public void digito_a_carga_util_do_veiculo(String cargaUtil) {
		cotacaoPage.getTxtPayload().sendKeys(cargaUtil);
	}

	@Quando("digito o peso do veiculo {string}")
	public void digito_o_peso_do_veiculo(String pesoTotal) {
		cotacaoPage.getTxtTotalWeight().sendKeys(pesoTotal);
	}

	@After
	public void tearDown(Scenario cenario) {
		this.cenario = cenario;
		System.out.println("--------------------------------------------");
		System.out.println("-------------FINALIZANDO AUTOMAÇÃO----------");
		System.out.println("*****STATUS: "+cenario.getStatus());
		//BrowserFactory.exitChromeDriver(driver);
	}
}
