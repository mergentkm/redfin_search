package com.redfin.pages;

import com.redfin.utilities.ConfigurationReader;
import com.redfin.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//form[@class='SearchBoxForm']//button")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='item-sub-title' and contains(text(),'Irvine')]")
    public WebElement suggestedCity;

    @FindBy(xpath = "//a[@class='item-title block' and contains(text(), '92124')]")
    public WebElement suggestedZip;

    @FindBy(xpath="//div[@class='homeAddressV2']")
    public List<WebElement> properties;


    public WebElement getSuggestedOption(String property) {
        return Driver.getDriver().findElement(By.xpath("//div[@class='item-sub-title' and contains(text(),'"+
                ConfigurationReader.getProperty(property)+"')]"));
    }
}
