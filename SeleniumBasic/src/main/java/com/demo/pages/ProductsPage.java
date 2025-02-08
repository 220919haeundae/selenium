package com.demo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By productsHeader = By.xpath("//*[@id=\"account\"]/div[2]/div/div/ul/li[1]/a/span[1]");

    public boolean isProductsHeaderDisplayed() {
        return find(productsHeader).isDisplayed();
    }

}
