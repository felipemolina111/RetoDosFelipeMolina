package com.dekosas.PageOjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BusquedaBotellaTritanPageObject extends PageObject {

    By btnAgregarAlCarro= By.xpath("(//button[@type='submit'])[2]");
    By btnAgregarAlCarroDos = By.xpath("(//button[@type='submit'])[5]");
    By btnAgregarAlCarroTres = By.xpath("(//button[@type='submit'])[6]");
    By imgArticulo = By.xpath("//img[@data-src ='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/z/s/zs9421_1.jpg']");
    By imgArticuloDos = By.xpath("//img[@data-src ='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/3/3/33236.jpg']");
    By imgArticuloTres = By.xpath("//img[@data-src ='https://dekosas.com/co/media/catalog/product/cache/164940938088390570ed192008480ac2/x/d/xd0706_2.jpg']");
    By columnMain = By.xpath("//div[@class='search results']");

    public By getBtnAgregarAlCarro() { return btnAgregarAlCarro; }
    public By getBtnAgregarAlCarroDos() { return btnAgregarAlCarroDos; }
    public By getBtnAgregarAlCarroTres() { return btnAgregarAlCarroTres; }
    public By getImgArticulo() { return imgArticulo; }
    public By getImgArticuloDos() { return imgArticuloDos; }
    public By getImgArticuloTres() { return imgArticuloTres; }
    public By getColumnMain() { return columnMain; }
}
