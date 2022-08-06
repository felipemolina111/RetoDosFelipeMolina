package com.dekosas.PageOjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccesoriosDeportivosPageObject extends PageObject {


    By btnBotellasDeportivas = By.xpath("//a[@href ='https://dekosas.com/co/accesorios-deportivos?cat=829']");
    By colomnaMain = By.xpath("//div[@class='sidebar-content']");



    public By getBtnBotellasDeportivas() { return btnBotellasDeportivas; }
    public By getColomnaMain() { return colomnaMain; }
}
