package com.dekosas.Steps;

import com.dekosas.PageOjects.BotellasDeportivasPageObject;
import com.dekosas.Utils.MouseFloante;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class BotellasDeportivasStep {


    BotellasDeportivasPageObject botellasDeportivasPageObject = new BotellasDeportivasPageObject();
    Scroll scroll = new Scroll();
    MouseFloante mouseFloante = new MouseFloante();

    @Step
    public void bajarScroll (){
        scroll.scrollElemento(botellasDeportivasPageObject.getDriver(),
                botellasDeportivasPageObject.getColumnMain());
    }

    @Step
    public void flotarMouseSobreArticulo(){
    mouseFloante.moverMouseFlotante(botellasDeportivasPageObject.getDriver(),
            botellasDeportivasPageObject.getImgArticulo());
    }

    @Step
    public void clickAgregarCarroArticulo (){
        botellasDeportivasPageObject.getDriver().
                findElement(botellasDeportivasPageObject.getBtnAgregarAlCarro()).click();
    }
}
