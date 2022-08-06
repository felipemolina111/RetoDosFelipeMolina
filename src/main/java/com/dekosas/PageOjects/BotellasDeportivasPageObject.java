package com.dekosas.PageOjects;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BotellasDeportivasPageObject extends PageObject {

    By imgArticulo = By.xpath("//img[@data-src ='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/z/s/zs7487_1.jpg']");
    By btnAgregarAlCarro = By.xpath("(//button[@type='submit'])[4]");
    By columnMain =By.xpath("//div[@class='column main']");


    public By getImgArticulo() { return imgArticulo; }
    public By getBtnAgregarAlCarro() { return btnAgregarAlCarro; }
    public By getColumnMain() { return columnMain; }
}
