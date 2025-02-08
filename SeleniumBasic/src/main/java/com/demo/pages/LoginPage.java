package com.demo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private By usernameField = By.id("id");
    private By passwordField = By.id("pw");
    private By loginButton = By.id("log.login");
    private By errorMessage = By.xpath("//*[@id=\"err_common\"]/div");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public ProductsPage clickLoginButton() {
        click(loginButton);
        return new ProductsPage();
    }

    public ProductsPage logIntoApplication(String username, String password) throws Exception {
        Thread.sleep(2000);
        setUsername(username);
        Thread.sleep(2000);
        setPassword(password);
        Thread.sleep(1000);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

}
