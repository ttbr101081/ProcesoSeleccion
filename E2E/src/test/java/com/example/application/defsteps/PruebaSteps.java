package com.example.application.defsteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.annotations.Concurrent;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;
@Concurrent(threads = "1")
public class PruebaSteps {
    private Map<String, Object> vars;
    JavascriptExecutor js;


    @Managed()
    WebDriver driver;


    //Code that is ejectuted before the flow
    @Given("Agregar dos productos al carrito")
    public void añadir() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(co);
        js = (JavascriptExecutor) driver;
        driver.get("https://opencart.abstracta.us/index.php?route=common/home");
        driver.manage().window().maximize();
        {
            WebElement element = driver.findElement(By.cssSelector(".product-layout:nth-child(1) button:nth-child(3)"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")));
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div[3]/button[1]")).click();
        js.executeScript("window.scrollTo(0,387.20001220703125)");
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div/div[3]/button[1]")));
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div/div[3]/button[1]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select")));
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/select/option[2]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")));
        }
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();
        js.executeScript("window.scrollTo(0,331.20001220703125)");

    }



    @Then("Finalizar la compra hasta la confirmación Your order has been placed")
    public void finalizar_flujo() {
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div/a")));
        }
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText();
        String ExpectedTitle = "Your order has been placed!";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
        driver.quit();
    }

    @And("Completar el Checkout como invitado Guest Checkout")
    public void checkoutinvitado() {
        driver.get("https://opencart.abstracta.us/index.php?route=checkout/checkout");
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(.,\'Guest Checkout\')]")));
        }
        driver.findElement(By.xpath("//label[contains(.,\'Guest Checkout\')]")).click();
        driver.findElement(By.xpath("//div[@id=\'collapse-checkout-option\']/div/div/div/input")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id=\'input-payment-firstname\']")));
        }
        driver.findElement(By.xpath("//input[@id=\'input-payment-firstname\']")).sendKeys("Rodrigo");
        driver.findElement(By.xpath("//input[@id=\'input-payment-lastname\']")).sendKeys("Teran");
        driver.findElement(By.xpath("//input[@id=\'input-payment-email\']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id=\'input-payment-telephone\']")).sendKeys("022222222");
        driver.findElement(By.id("input-payment-company")).sendKeys("company");
        driver.findElement(By.xpath("//input[@id=\'input-payment-address-1\']")).sendKeys("Quito");
        driver.findElement(By.xpath("//input[@id=\'input-payment-address-2\']")).sendKeys("Quito");
        driver.findElement(By.xpath("//input[@id=\'input-payment-city\']")).sendKeys("Quito");
        driver.findElement(By.xpath("//input[@id=\'input-payment-postcode\']")).sendKeys("170562");
        {
            WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Ecuador']")).click();
        }
        js.executeScript("window.scrollTo(0,374)");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        {
            WebElement dropdown = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[1]/div[2]/fieldset/div[7]/select"));
            dropdown.findElement(By.xpath("//option[. = 'Pichincha']")).click();
        }
        js.executeScript("window.scrollTo(0,374)");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div/div[3]/div/input")).click();
        js.executeScript("window.scrollTo(0,317)");
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'collapse-shipping-method\']/div/p[4]/textarea")));
        }
        driver.findElement(By.xpath("//div[@id=\'collapse-shipping-method\']/div/p[4]/textarea")).sendKeys("1234567890");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[4]/div[2]/div/div[2]/div/input")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'collapse-payment-method\']/div/div[2]/label")));
        }
        driver.findElement(By.xpath("//div[@id=\'collapse-payment-method\']/div/div[2]/label")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'collapse-payment-method\']/div/p[3]/textarea")));
        }
        driver.findElement(By.xpath("//div[@id=\'collapse-payment-method\']/div/p[3]/textarea")).sendKeys("12345678900");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[5]/div[2]/div/div[3]/div/input[1]")).click();
        driver.findElement(By.xpath("//div[@id=\'collapse-payment-method\']/div/div[3]/div/input[2]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, MAX_TIMEOUT);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'collapse-checkout-confirm\']/div/div[2]/div/input")));
        }
        driver.findElement(By.xpath("//div[@id=\'collapse-checkout-confirm\']/div/div[2]/div/input")).click();
    }

    private final Duration MAX_TIMEOUT=Duration.ofMinutes(10);

    @When("Visualizar el carrito")
    public void carrrito() {
        driver.findElement(By.cssSelector("a > .fa-shopping-cart")).click();
        String ActualTitle = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText();
        String ExpectedTitle = "Use Gift Certificate  (0.00kg)";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
}
