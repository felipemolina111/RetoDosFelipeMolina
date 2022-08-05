package com.dekosas.StepDefinitions;

import com.dekosas.Steps.LoginStep;
import com.dekosas.Steps.MiCuentaStep;
import com.dekosas.Steps.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    LoginStep loginStep;

    @Steps
    MiCuentaStep miCuentaStep;


    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        paginaPrincipalStep.abrirPagina();


    }


    @Cuando("^el usuario ingrese el usuario y la contraseña$")
    public void ingreseElUsuarioYLaContraseña() throws IOException {
        paginaPrincipalStep.clickMiCuenta();
        loginStep.ingresarCorreo();
        loginStep.ingresarClave();
        loginStep.clickEntrar();
    }

    @Entonces("^el usuario visualizara el mensaje Mi Cuenta$")
    public void visualizaraElMensajeMiCuenta() {
    //miCuentaStep.validarMensajeMiCuenta();
    }



}
