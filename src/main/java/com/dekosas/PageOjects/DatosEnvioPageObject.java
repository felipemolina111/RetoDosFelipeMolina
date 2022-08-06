package com.dekosas.PageOjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DatosEnvioPageObject extends PageObject {



    By txtDireccion = By.xpath("//input[@name='street[0]']");
    By lstEstado = By.xpath("//select[@name='region_id']");
    By lstCiudad = By.xpath("//select[@name='city-select']");
    By txtTelefono = By.xpath("//input[@name='telephone']");
    By lstTipoDocumento = By.xpath("//select[@name='bss_custom_field[tipo_identidad]']");
    By txtNumeroDocumento = By.xpath("//input[@name='bss_custom_field[cedula_o_nit]']");
    By msjDatosDeEnvio = By.xpath("//div[text()='Dirección de envío']");
    By btnMiniCart = By.xpath("//i[@class='minicart-icon porto-icon-shopping-cart']");
    By btnCancelarCompraArticulo = By.xpath("//a[@class='action delete']");
    By btnAceptarCancelarCompra = By.xpath("//span[text()='Aceptar']");
    By msjCarroVacio = By.xpath("//strong[text()='No tienes ningún artículo en tu carrito de compras.']");
    By imgArticulo = By.xpath("//li[@class='item product product-item odd last']");


    public By getTxtDireccion() { return txtDireccion; }
    public By getLstEstado() { return lstEstado; }
    public By getLstCiudad() { return lstCiudad; }
    public By getTxtTelefono() { return txtTelefono; }
    public By getLstTipoDocumento() { return lstTipoDocumento; }
    public By getTxtNumeroDocumento() { return txtNumeroDocumento; }
    public By getMsjDatosDeEnvio() { return msjDatosDeEnvio; }
    public By getBtnMiniCart() { return btnMiniCart; }
    public By getBtnCancelarCompraArticulo() { return btnCancelarCompraArticulo; }
    public By getBtnAceptarCancelarCompra() { return btnAceptarCancelarCompra; }
    public By getMsjCarroVacio() { return msjCarroVacio; }
    public By getImgArticulo() { return imgArticulo; }
}
