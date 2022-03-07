package com.tricents.steps;

import com.tricents.pages.SelectPriceOptionPage;

import io.cucumber.java.pt.Quando;
import managers.TestContext;

/**
 * Classe responsavel pela execução dos passos de teste das especificacoes dos arquivos ".feature", da guia Select Price Option
 */
public class SelectPriceOptionStep {

	TestContext testContext;
	SelectPriceOptionPage selectPriceOptionPage;
	
	public SelectPriceOptionStep(TestContext testContext) {
		this.testContext = testContext;
		selectPriceOptionPage = testContext.getPageObjectManager().getSelectPriceOptionPage();
	}
	
	@Quando("verifico que estou na guia Select Price Option")
	public void verifico_que_estou_na_guia_select_price_option() {
		selectPriceOptionPage.getMenuSelectPriceOptionIsActive();
	}

	@Quando("seleciono a opcao de cotacao gold")
	public void seleciono_a_opcao_de_cotacao_gold() {
		selectPriceOptionPage.getRdbSelectPriceOption().click();
	}

	@Quando("clico em next de Select Price Option")
	public void clico_em_next_de_select_price_option() throws InterruptedException {
		Thread.sleep(2000);
		selectPriceOptionPage.getBtnNextSendQuote().click();
	}
}
