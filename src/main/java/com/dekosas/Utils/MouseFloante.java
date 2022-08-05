package com.dekosas.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseFloante {

    public void moverMouseFlotante (WebDriver driver, By elemento){

        WebElement figura = driver.findElement(elemento);

        Actions actions = new Actions(driver);
        actions.moveToElement(figura).perform();


    }
}
