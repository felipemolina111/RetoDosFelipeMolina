package com.dekosas.Steps;

import com.dekosas.PageOjects.LoginPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.EsperaImplicita;
import cucumber.api.java.es.E;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class LoginStep {

    LoginPageObject loginPageObject = new LoginPageObject();
    Datos datos = new Datos();
    EsperaImplicita esperaImplicita = new EsperaImplicita();



    @Step
    public void ingresarCorreo() throws IOException {
    loginPageObject.getDriver().findElement(loginPageObject.getTxtCorreo()).
            sendKeys(datos.leerDatosExcel("DatosRetoDos.xlsx","Login",1,0));
    }

    @Step
    public void ingresarClave() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtClave()).
                sendKeys(datos.leerDatosExcel("DatosRetoDos.xlsx","Login",1,1));
    }

    @Step
    public void clickEntrar (){
    loginPageObject.getDriver().findElement(loginPageObject.getBtnEntrar()).click();
      esperaImplicita.esperaImplicita(5);
    }

}
