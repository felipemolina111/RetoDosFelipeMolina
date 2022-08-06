package com.dekosas.Steps;

import com.dekosas.PageOjects.DatosEnvioPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.EsperaExplicita;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.ListaDesplegable;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class DatosEnvioStep {

    DatosEnvioPageObject datosEnvioPageObject = new DatosEnvioPageObject();
    Datos datos = new Datos();
    ListaDesplegable listaDesplegable = new ListaDesplegable();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public  void esperarMensajeDatosDeEnvio (){
        esperaExplicita.esperaExplicitaTexto(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getMsjDatosDeEnvio());
    }

    @Step
    public void ingresarDireccion() throws IOException {
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getTxtDireccion()).
                sendKeys(datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,2));
    }

    @Step
    public void seleccionarEstado() throws IOException {
        String valor = datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,3);
        listaDesplegable.seleccionarTextoVisible(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getLstEstado(),valor);

    }

    @Step
    public void seleccionarCiudad() throws IOException {
        String valor = datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,4);
        listaDesplegable.seleccionarTextoVisible(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getLstCiudad(),valor);
    }

    @Step
    public void ingresarTelefono() throws IOException {
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getTxtTelefono()).
                sendKeys(datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,5));
    }

    @Step
    public void seleccionarTipoDocumento() throws IOException {
        String valor = datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,6);
        listaDesplegable.seleccionarTextoVisible(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getLstTipoDocumento(),valor);
    }

    @Step
    public void ingresarNumeroDocumento() throws IOException {
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getTxtNumeroDocumento()).
                sendKeys(datos.leerDatosExcel("DatosRetoDos.xlsx","DatosEnvio",1,7));
    }

    @Step
    public void clickMinicart (){
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getBtnMiniCart()).click();
    }

    @Step
    public void clickCancelarCompraArticulo (){
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getBtnCancelarCompraArticulo()).click();
    }

    @Step
    public void clickAceptarCancelarCompra (){
        datosEnvioPageObject.getDriver().findElement(datosEnvioPageObject.getBtnAceptarCancelarCompra()).click();
        esperaImplicita.esperaImplicita(3);
    }

    @Step
    public void esperaBotonAceptar(){
        esperaExplicita.esperaExplicitaTexto(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getBtnAceptarCancelarCompra());

    }

    @Step
    public void esperaBotonCancelarCompra(){
        esperaExplicita.esperaExplicitaTexto(datosEnvioPageObject.getDriver(),
                datosEnvioPageObject.getBtnCancelarCompraArticulo());
    }

    @Step
    public void validarCarroVacio(){
        Assert.assertThat(datosEnvioPageObject.getDriver().
                findElement(datosEnvioPageObject.getMsjCarroVacio()).isDisplayed(), Matchers.is(true));
    }
}
