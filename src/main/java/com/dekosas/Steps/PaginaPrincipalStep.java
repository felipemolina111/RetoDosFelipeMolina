package com.dekosas.Steps;

import com.dekosas.PageOjects.PaginaPrincipalPageObject;
import com.dekosas.Utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;


public class PaginaPrincipalStep {

PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void abrirPagina (){
    paginaPrincipalPageObject.open();
}

    @Step
    public void clickMiCuenta (){
    paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void clickTodaLaTienda (){
    paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnTodaLaTienda()).click();
    }

    @Step
    public void clickDeportes (){
    paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnDeportes()).click();
    }

    @Step
    public void clickBienvenidoMiCuenta (){
    paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnBienvenidoMiCuenta()).click();
    }

}
