package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriarMovimentacao{

    @FindBy(id="tipo")
    private WebElement selectTipo;
    @FindBy(id="data_transacao")
    private WebElement txtData;
    @FindBy(id="data_pagamento")
    private WebElement txtDataPgto;
    @FindBy(id="descricao")
    private WebElement txtDescricao;
    @FindBy(id="interessado")
    private WebElement txtInteressado;
    @FindBy(id="valor")
    private WebElement txtValor;
    @FindBy(id="conta")
    private WebElement selectConta;
    @FindBy(id="status_pago")
    private WebElement radioSituacao;
    @FindBy(className = "btn-primary")
    private WebElement btnSalvar;


    public void CriarMovimentacao(){

        selectTipo.sendKeys("Receita");
        txtData.sendKeys("01/02/2020");
        txtDataPgto.sendKeys("01/06/2020");
        txtDescricao.sendKeys("Aluguel do Apto 09");
        txtInteressado.sendKeys("Seu Barriga");
        txtValor.sendKeys("1800.00");
        selectConta.sendKeys("Apoena Bteste 03");
        radioSituacao.click();
        btnSalvar.click();

    }
}