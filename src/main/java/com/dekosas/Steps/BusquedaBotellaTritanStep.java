package com.dekosas.Steps;

import com.dekosas.PageOjects.BusquedaBotellaTritanPageObject;
import com.dekosas.Utils.MouseFloante;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class BusquedaBotellaTritanStep {

    BusquedaBotellaTritanPageObject busquedaBotellaTritanPageObject = new BusquedaBotellaTritanPageObject();
    Scroll scroll = new Scroll();
    MouseFloante mouseFloante = new MouseFloante();


    @Step
    public void bajarScroll(){
        scroll.scrollElemento(busquedaBotellaTritanPageObject.getDriver(),
                busquedaBotellaTritanPageObject.getColumnMain());
    }

    @Step
    public void flotarMouseSobreArticulo(){
        mouseFloante.moverMouseFlotante(busquedaBotellaTritanPageObject.getDriver(),
                busquedaBotellaTritanPageObject.getImgArticulo());
    }

    @Step
    public void clickAgregarAlCarro(){
        busquedaBotellaTritanPageObject.getDriver().
                findElement(busquedaBotellaTritanPageObject.getBtnAgregarAlCarro()).click();
    }

    @Step
    public void flotarMouseSobreArticuloDos(){
        mouseFloante.moverMouseFlotante(busquedaBotellaTritanPageObject.getDriver(),
                busquedaBotellaTritanPageObject.getImgArticuloDos());
    }

    @Step
    public void clickAgregarAlCarroDos(){
        busquedaBotellaTritanPageObject.getDriver().
                findElement(busquedaBotellaTritanPageObject.getBtnAgregarAlCarroDos()).click();
    }

    @Step
    public void flotarMouseSobreArticuloTres(){
        mouseFloante.moverMouseFlotante(busquedaBotellaTritanPageObject.getDriver(),
                busquedaBotellaTritanPageObject.getImgArticuloTres());
    }

    @Step
    public void clickAgregarAlCarroTres(){
        busquedaBotellaTritanPageObject.getDriver().
                findElement(busquedaBotellaTritanPageObject.getBtnAgregarAlCarroTres()).click();
    }

}
