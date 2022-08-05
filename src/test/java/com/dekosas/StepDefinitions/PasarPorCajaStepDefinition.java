package com.dekosas.StepDefinitions;

import com.dekosas.Steps.BusquedaBotellaTritanStep;
import com.dekosas.Steps.CarroComprasStep;
import com.dekosas.Steps.DatosEnvioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class PasarPorCajaStepDefinition {

    @Steps
    CarroComprasStep carroComprasStep;

    @Steps
    BusquedaBotellaTritanStep busquedaBotellaTritanStep;

    @Steps
    DatosEnvioStep datosEnvioStep;


    @Cuando("^agregar tres articulos al carro de compra$")
    public void agregarTresArticulosAlCarroDeCompra() {
    carroComprasStep.ingresarNuevaBusqueda();
    carroComprasStep.clickEnterBusqueda();
    busquedaBotellaTritanStep.bajarScroll();
    busquedaBotellaTritanStep.flotarMouseSobreArticulo();
    busquedaBotellaTritanStep.clickAgregarAlCarro();

    carroComprasStep.ingresarNuevaBusqueda();
    carroComprasStep.clickEnterBusqueda();
    busquedaBotellaTritanStep.bajarScroll();
    busquedaBotellaTritanStep.flotarMouseSobreArticuloDos();
    busquedaBotellaTritanStep.clickAgregarAlCarroDos();

    carroComprasStep.ingresarNuevaBusqueda();
    carroComprasStep.clickEnterBusqueda();
    busquedaBotellaTritanStep.bajarScroll();
    busquedaBotellaTritanStep.flotarMouseSobreArticuloTres();
    busquedaBotellaTritanStep.clickAgregarAlCarroTres();

    carroComprasStep.esperarMensajeTotalPedido();
    carroComprasStep.clickPasarPorCaja();
    }


    @Cuando("^passar por caja - llenar los datos y cancelar compra$")
    public void passarPorCajaLlenarLosDatosYCancelarCompra() throws IOException {
        datosEnvioStep.esperarMensajeDatosDeEnvio();
        datosEnvioStep.ingresarDireccion();
        datosEnvioStep.seleccionarEstado();
        datosEnvioStep.seleccionarCiudad();
        datosEnvioStep.ingresarTelefono();
        datosEnvioStep.seleccionarTipoDocumento();
        datosEnvioStep.ingresarNumeroDocumento();
        datosEnvioStep.clickMinicart();
        datosEnvioStep.esperaBotonCancelarCompra();
        datosEnvioStep.clickCancelarCompraArticulo();
        datosEnvioStep.esperaBotonAceptar();
        datosEnvioStep.clickAceptarCancelarCompra();
        datosEnvioStep.esperaBotonCancelarCompra();


        datosEnvioStep.clickCancelarCompraArticulo();
        datosEnvioStep.esperaBotonAceptar();
        datosEnvioStep.clickAceptarCancelarCompra();
        datosEnvioStep.esperaBotonCancelarCompra();

        datosEnvioStep.clickCancelarCompraArticulo();
        datosEnvioStep.esperaBotonAceptar();
        datosEnvioStep.clickAceptarCancelarCompra();

    }

    @Entonces("^visualizara no tienes ningun articulo en tu carrito de compras$")
    public void visualizaraNoTienesNingunArticuloEnTuCarritoDeCompras() {

       // datosEnvioStep.validarCarroVacio();
    }



}
