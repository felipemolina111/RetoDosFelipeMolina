package com.dekosas.PageOjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeportesPageObject extends PageObject {

   By btnAccesoriosDeportivos = By.xpath("//a[text()='Accesorios Deportivos']");
   By columnaMain = By.xpath("//div[@class='block widget block-products-list grid']");

    public By getBtnAccesoriosDeportivos() { return btnAccesoriosDeportivos; }
    public By getColumnaMain() { return columnaMain; }
}
