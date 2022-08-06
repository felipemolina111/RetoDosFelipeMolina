package com.dekosas.PageOjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://dekosas.com/co/")

public class PaginaPrincipalPageObject extends PageObject {

    By btnMiCuenta = By.xpath("//div[@class='porto-sicon-box mb-0 text-left style_1 default-icon']");
    By btnTodaLaTienda = By.xpath("//div[@class='main-toggle-menu closed']");
    By btnDeportes= By.xpath("//a[@title='Deportes']");
    By btnBienvenidoMiCuenta = By.xpath("//div[@class='porto-sicon-box mb-0 text-left style_1 default-icon']");





    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
    public By getBtnTodaLaTienda() { return btnTodaLaTienda; }
    public By getBtnDeportes() { return btnDeportes; }
    public By getBtnBienvenidoMiCuenta() { return btnBienvenidoMiCuenta; }
}
