package com.dekosas.PageOjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarroComprasPageObject extends PageObject {


    By txtCantidadArticulos = By.xpath("//input[@name='cart[3896][qty]']");
    By btnAumentarCantidad = By.xpath("//a[@class='qty-inc']");
    By txtBarraBusqueda = By.xpath("//input[@name='q']");
    By btnEnterBusqueda = By.xpath("//button[@class='action search']");
    By btnPasarPorCaja = By.xpath("//button[@title='Pasar por caja']");
    By msjTotalPedido = By.xpath("//strong[@data-bind='i18n: title']");
    By msjCantidadArticulos = By.xpath("//span[@class='count']");
    By btnActualizarCarroCompras = By.xpath("//span[text()='Actualizar carrito de compras']");
    By btnMiniCart = By.xpath("//a[@class='action showcart']");



    public By getTxtCantidadArticulos() { return txtCantidadArticulos; }

    public By getBtnAumentarCantidad() { return btnAumentarCantidad; }

    public By getTxtBarraBusqueda() { return txtBarraBusqueda; }

    public By getBtnEnterBusqueda() { return btnEnterBusqueda; }

    public By getBtnPasarPorCaja() { return btnPasarPorCaja; }

    public By getMsjTotalPedido() { return msjTotalPedido; }

    public By getMsjCantidadArticulos() { return msjCantidadArticulos; }

    public By getBtnActualizarCarroCompras() { return btnActualizarCarroCompras; }

    public By getBtnMiniCart() { return btnMiniCart; }
}
