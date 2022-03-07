package com.tricents.steps;

import org.junit.Assert;
import com.tricents.pages.InsurantDataPage;
import io.cucumber.java.pt.Quando;
import managers.TestContext;

public class InsurantDataStep {

	TestContext testContext;
	InsurantDataPage insurantDataPage;
	
	public InsurantDataStep(TestContext testContext) {
		this.testContext = testContext;
		insurantDataPage = testContext.getPageObjectManager().getInsurantDataPagePage();
	}
	
	@Quando("verifico que estou na guia Insurant Data")
	public void verifico_que_estou_na_guia_insurant_data() {
		Assert.assertTrue(insurantDataPage.getMenuEnterInsurantActive().isDisplayed());
	}

	@Quando("digito o primeiro nome do cliente {string}")
	public void digito_o_primeiro_nome_do_cliente(String nome) {
		insurantDataPage.getTxtFirstName().sendKeys(nome);
	}

	@Quando("digito o sobrenome do cliente {string}")
	public void digito_o_sobrenome_do_cliente(String sobrenome) {
		insurantDataPage.getTxtLastName().sendKeys(sobrenome);
	}

	@Quando("digito a data de nascimento do cliente {string}")
	public void digito_a_data_de_nascimento_do_cliente(String data) {
		insurantDataPage.getTxtDateofBirth().sendKeys(data);
	}

	@Quando("seleciono o genero do cliente masculino")
	public void seleciono_o_genero_do_cliente_masculino() {
		insurantDataPage.getRdbGenderMale().click();
	}

	@Quando("digito o endereco do cliente {string}")
	public void digito_o_endereco_do_cliente(String endereco) {
		insurantDataPage.getTxtStreetAddress().sendKeys(endereco);
	}

	@Quando("seleciono o pais de nascimento do cliente {string}")
	public void seleciono_o_pais_de_nascimento_do_cliente(String pais) {
		insurantDataPage.getSelectCountry().sendKeys(pais);
	}

	@Quando("digito o cep do cliente {string}")
	public void digito_o_cep_do_cliente(String cep) {
		insurantDataPage.getTxtZipCode().sendKeys(cep);
	}

	@Quando("digito a cidade do cliente {string}")
	public void digito_a_cidade_do_cliente(String cidade) {
		insurantDataPage.getTxtCity().sendKeys(cidade);
	}

	@Quando("seleciono a profissao do cliente {string}")
	public void seleciono_a_profissao_do_cliente(String profissao) {
		insurantDataPage.getSelectOccupation().sendKeys("Unemployed");
	}

	@Quando("seleciono os hobbies do cliente")
	public void seleciono_os_hobbies_do_cliente(){
		insurantDataPage.getRdbHobbies().click();
		insurantDataPage.getRdbHobbies2().click();
	}

	@Quando("digito o website do cliente {string}")
	public void digito_o_website_do_cliente(String site) {
		insurantDataPage.getTxtWebsite().sendKeys(site);
	}

	@Quando("clico em next de insurant data")
	public void clico_em_next_de_insurant_data() {
		insurantDataPage.getBtnNextEnterProductData().click();
	}
}
