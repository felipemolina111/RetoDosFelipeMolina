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
        esperaImplicita.esperaImplicita(3);
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
    @Step
    public void esperarMensajeTotalPedido(){
        esperaExplicita.esperaExplicitaTexto(carroComprasPageObject.getDriver(),
                carroComprasPageObject.getMsjTotalPedido());
    }

    @Step
    public void esperaMensajeCantidadDeArticulos(){
        esperaExplicita.esperaExplicitaTexto(carroComprasPageObject.getDriver(),
                carroComprasPageObject.getMsjCantidadArticulos());
    }

    @Step
    public void validarCantidadDeArticulos (){
    assertEquals(carroComprasPageObject.getDriver().
            findElement(carroComprasPageObject.getMsjCantidadArticulos()).getText(),"4");
    }

    @Step
    public void actualizarCarroCompras (){
        carroComprasPageObject.getDriver().
                findElement(carroComprasPageObject.getBtnActualizarCarroCompras()).click();
        esperaImplicita.esperaImplicita(3);
    }


}
