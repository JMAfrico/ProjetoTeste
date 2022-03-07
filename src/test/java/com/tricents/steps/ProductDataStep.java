package com.tricents.steps;

import org.junit.Assert;

import com.tricents.pages.ProductDataPage;

import io.cucumber.java.pt.Quando;
import managers.TestContext;

public class ProductDataStep {

	TestContext testContext;
	ProductDataPage productDataPage;
	
	public ProductDataStep(TestContext testContext) {
		this.testContext = testContext;
		productDataPage = testContext.getPageObjectManager().getProductDataPage();
	}
	
	@Quando("verifico que estou na guia Product Data")
	public void verifico_que_estou_na_guia_product_data() {
		Assert.assertTrue(productDataPage.getMenuEnterProductDataActive().isDisplayed());
	}

	@Quando("seleciono a data inicial {string}")
	public void seleciono_a_data_inicial(String data) {
		productDataPage.getTxtStartDate().sendKeys(data);
	}

	@Quando("seleciono a soma do seguro {string}")
	public void seleciono_a_soma_do_seguro(String valor) {
		productDataPage.getSelectInsuranceSum().sendKeys(valor);
	}

	@Quando("seleciono a classificacao do seguro {string}")
	public void seleciono_a_classificacao_do_seguro(String classificacao) {
		productDataPage.getSelectMeritRating().sendKeys(classificacao);
	}

	@Quando("seleciono a opcao {string} de seguro contra danos")
	public void seleciono_a_opcao_de_seguro_contra_danos(String opcao) {
		productDataPage.getSelectDamageInsurance().sendKeys("No Coverage");
	}

	@Quando("seleciono algum item de produto adicional")
	public void seleciono_algum_item_de_produto_adicional() {
		productDataPage.getRdbOptionalProducts().click();
	}

	@Quando("seleciono a opcao {string} de carro de cortesia")
	public void seleciono_a_opcao_de_carro_de_cortesia(String opcao) {
		productDataPage.getSelectCourtesyCar().sendKeys("no");
	}

	@Quando("clico em next de product data")
	public void clico_em_next_de_product_data() {
		productDataPage.getBtnNextSelectPriceOption().click();
	}
}
