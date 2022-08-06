package com.dekosas.Steps;

import com.dekosas.PageOjects.AccesoriosDeportivosPageObject;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class AccesoriosDeportivosStep {


    AccesoriosDeportivosPageObject accesoriosDeportivosPageObject = new AccesoriosDeportivosPageObject();
    Scroll scroll = new Scroll();




    @Step
    public void bajarScroll(){
        scroll.scrollElemento(accesoriosDeportivosPageObject.getDriver(),
                accesoriosDeportivosPageObject.getColomnaMain());
    }

    @Step
    public void clickBotellasDeportivas (){
       accesoriosDeportivosPageObject.getDriver().
               findElement(accesoriosDeportivosPageObject.getBtnBotellasDeportivas()).click();
    }





}
