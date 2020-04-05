package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * it meant to be extended
 * purpose of this class is being basement for all other classes
 */

public abstract class AbstractBasePage {

    // it is VERY important ! it serves to initialize the object and it finds the Elements!!
    // without it NO PAGE Object Model class will work !!!
    // finding web elements in POM : selenium has smth to improve this process : Page Factory class
    // It helps to find element easier, syntax is shorter, more organized

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,20);

    public AbstractBasePage(){
        PageFactory.initElements(driver, this); // this is for findby annotations, we use it to initialize elements

    }
}
