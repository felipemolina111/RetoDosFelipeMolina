package com.dekosas.PageOjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {

    By txtCorreo = By.xpath("//input[@id ='social_login_email']");
    By txtClave =   By.xpath("//input[@id ='social_login_pass']");
    By btnEntrar = By.xpath("//button[@id='bnt-social-login-authentication']");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() { return btnEntrar; }
}
