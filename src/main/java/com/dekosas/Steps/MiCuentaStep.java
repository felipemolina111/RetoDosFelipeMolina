package com.dekosas.Steps;

import com.dekosas.PageOjects.MiCuentaPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class MiCuentaStep {

   MiCuentaPageObject miCuentaPageObject = new MiCuentaPageObject();


    @Step
    public void validarMensajeMiCuenta(){
    Assert.assertThat(miCuentaPageObject.getDriver().
            findElement(miCuentaPageObject.getMsjMiCuenta()).isDisplayed(), Matchers.is(true));
    }


}
