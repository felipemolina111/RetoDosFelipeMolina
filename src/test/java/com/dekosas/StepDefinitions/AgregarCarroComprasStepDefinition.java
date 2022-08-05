package com.dekosas.StepDefinitions;

import com.dekosas.Steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarCarroComprasStepDefinition {

@Steps
PaginaPrincipalStep paginaPrincipalStep;

@Steps
DeportesStep deportesStep;

@Steps
AccesoriosDeportivosStep accesoriosDeportivosStep;

@Steps
BotellasDeportivasStep botellasDeportivasStep;

@Steps
CarroComprasStep carroComprasStep;

@Steps
BusquedaBotellaTritanStep busquedaBotellaTritanStep;

@Steps
DatosEnvioStep datosEnvioStep;

    @Cuando("^el usuario selecciona una categoria y una subcategoria$")
    public void seleccione_una_categoria_y_una_subcategoria() {
    paginaPrincipalStep.clickTodaLaTienda();
    paginaPrincipalStep.clickDeportes();
    deportesStep.bajarScroll();
    deportesStep.clickAccesoriosDeportivos();
    accesoriosDeportivosStep.bajarScroll();
    accesoriosDeportivosStep.clickBotellasDeportivas();

    }

    @Cuando("^el usuario agregue un producto en tres cantidades y luego otro producto$")
    public void agregue_un_producto_en_tres_cantidades_y_luego_otro_producto() {

        botellasDeportivasStep.bajarScroll();
        botellasDeportivasStep.flotarMouseSobreArticulo();
        botellasDeportivasStep.clickAgregarCarroArticulo();
        carroComprasStep.clickAumentarCantidad();
        carroComprasStep.clickAumentarCantidad();
        carroComprasStep.actualizarCarroCompras();
        carroComprasStep.ingresarNuevaBusqueda();
        carroComprasStep.clickEnterBusqueda();
        busquedaBotellaTritanStep.bajarScroll();
        busquedaBotellaTritanStep.flotarMouseSobreArticulo();
        busquedaBotellaTritanStep.clickAgregarAlCarro();

    }

    @Entonces("^el usuario visualizara dos articulos y cuatro cantidades$")
    public void visualizara_dos_articulos_y_cuatro_cantidades() {
    datosEnvioStep.clickMinicart();
    carroComprasStep.esperaMensajeCantidadDeArticulos();
    carroComprasStep.validarCantidadDeArticulos();
    }


}
