package com.dekosas.Steps;

import com.dekosas.PageOjects.CarroComprasPageObject;
import com.dekosas.Utils.EsperaExplicita;
import com.dekosas.Utils.EsperaImplicita;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;


import static org.junit.Assert.assertEquals;

public class CarroComprasStep {

    CarroComprasPageObject carroComprasPageObject = new CarroComprasPageObject();
    Scroll scroll = new Scroll();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    EsperaImplicita esperaImplicita = new EsperaImplicita();



    @Step
    public void clickAumentarCantidad(){
        carroComprasPageObject.getDriver().
                findElement(carroComprasPageObject.getBtnAumentarCantidad()).click();
    }

    @Step
    public void borrarCantidadArticulos(){
    carroComprasPageObject.getDriver().
        findElement(carroComprasPageObject.getTxtCantidadArticulos()).sendKeys(Keys.DELETE);
    }

    @Step
    public void ingresarNuevaBusqueda (){
        carroComprasPageObject.getDriver().
                findElement(carroComprasPageObject.getTxtBarraBusqueda()).sendKeys("Botella tritan");
    }

    @Step
    public void clickEnterBusqueda (){

        carroComprasPageObject.getDriver().
                findElement(carroComprasPageObject.getBtnEnterBusqueda()).click();
    }

    @Step
    public void clickPasarPorCaja (){

    carroComprasPageObject.getDriver().
            findElement(carroComprasPageObject.getBtnPasarPorCaja()).click();
}

    public void esperarMensajeTotalPedido(){
        esperaExplicita.esperaExplicitaTexto(carroComprasPageObject.getDriver(),
                carroComprasPageObject.getMsjTotalPedido());
    }

    public void esperaMensajeCantidadDeArticulos(){
        esperaExplicita.esperaExplicitaTexto(carroComprasPageObject.getDriver(),
                carroComprasPageObject.getMsjCantidadArticulos());

    }

    public void validarCantidadDeArticulos (){
    assertEquals(carroComprasPageObject.getDriver().
            findElement(carroComprasPageObject.getMsjCantidadArticulos()),"4");

    }

    public void actualizarCarroCompras (){
        carroComprasPageObject.getDriver().
                findElement(carroComprasPageObject.getBtnActualizarCarroCompras()).click();
        esperaImplicita.esperaImplicita(3);
    }

    public void clickMinicart (){

        carroComprasPageObject.getDriver().findElement(carroComprasPageObject.getBtnMiniCart()).click();

    }

}
