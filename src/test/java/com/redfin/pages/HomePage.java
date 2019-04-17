package com.redfin.pages;

import com.redfin.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "search-box-input")
    public WebElement searchBox;

    @FindBy(className = "inline-block SearchButton clickable float-right")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='item-sub-title' and contains(text(),'Irvine')]")
    public WebElement suggestedLocation;

    @FindBy(xpath="//div[@class='homeAddressV2']")
    public List<WebElement> properties;
}
