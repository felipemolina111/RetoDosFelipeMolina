package com.dekosas.PageOjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MiCuentaPageObject extends PageObject {

    By msjMiCuenta = By.xpath("//span[@class='base']");

    public By getMsjMiCuenta() { return msjMiCuenta; }
}
