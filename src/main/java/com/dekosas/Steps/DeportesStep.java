package com.dekosas.Steps;

import com.dekosas.PageOjects.DeportesPageObject;
import com.dekosas.Utils.Scroll;
import net.thucydides.core.annotations.Step;

public class DeportesStep {

    DeportesPageObject deportesPageObject = new DeportesPageObject();
    Scroll scroll = new Scroll();



    @Step
    public void bajarScroll(){
        scroll.scrollElemento(deportesPageObject.getDriver(),
                deportesPageObject.getColumnaMain());
    }


    @Step
    public void clickAccesoriosDeportivos(){
        deportesPageObject.getDriver().findElement(deportesPageObject.getBtnAccesoriosDeportivos()).click();

    }
}
