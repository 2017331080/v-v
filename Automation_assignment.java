package com.selenium.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		// Navigate to the website
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1000);
		 // Login
		WebElement usernameField = driver.findElement(By.id("user-name"));
	    usernameField.sendKeys("standard_user");
	    WebElement passwordField = driver.findElement(By.id("password"));
	    passwordField.sendKeys("secret_sauce");
	    WebElement loginButton = driver.findElement(By.id("login-button"));
	    loginButton.click();
	    Thread.sleep(2000);
	 // Add products to the cart
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButton.click();
        Thread.sleep(1000);
        addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]"));
        addToCartButton.click();
        Thread.sleep(1000);
        // Go to the cart page
        WebElement cartIcon = driver.findElement(By.className("shopping_cart_container"));
        cartIcon.click();
        Thread.sleep(2000);
        // Checkout to the next page
        WebElement checkoutButton = driver.findElement(By.xpath("//button[contains(text(),'Checkout')]"));
        checkoutButton.click();
        Thread.sleep(2000);
        // Fill the form and click the Continue button
        WebElement firstNameField = driver.findElement(By.id("first-name"));
        firstNameField.sendKeys("Nasif");
        WebElement lastNameField = driver.findElement(By.id("last-name"));
        lastNameField.sendKeys("Anwar");
        WebElement zipField = driver.findElement(By.id("postal-code"));
        zipField.sendKeys("12345");
        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();
        Thread.sleep(2000);
        // Finish the order
        WebElement finishButton = driver.findElement(By.xpath("//button[contains(text(),'Finish')]"));
        finishButton.click();
        Thread.sleep(3000);
        // close the browser
        driver.quit();
	}

}
