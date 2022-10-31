package src.test.java.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static src.test.java.core.DriverFactory.getWebdriver;

public class CustomerPage {
    WebDriverWait wait = new WebDriverWait(getWebdriver(), Duration.ofSeconds(10));

    private WebElement lblCustomerName() {
        return getWebdriver().findElement(By.id("field-customerName"));
    }

    private WebElement lblLastName() {
        return getWebdriver().findElement(By.id("field-contactLastName"));
    }

    private WebElement lblFirstName() {
        return getWebdriver().findElement(By.id("field-contactFirstName"));
    }

    private WebElement lblPhone() {
        return getWebdriver().findElement(By.id("field-phone"));
    }

    private WebElement lblAdress1() {
        return getWebdriver().findElement(By.id("field-addressLine1"));
    }

    private WebElement lblAdress2() {
        return getWebdriver().findElement(By.id("field-addressLine2"));
    }

    private WebElement lblCity() {
        return getWebdriver().findElement(By.id("field-city"));
    }

    private WebElement lblState() {
        return getWebdriver().findElement(By.id("field-state"));
    }

    private WebElement lblPostalCode() {
        return getWebdriver().findElement(By.id("field-postalCode"));
    }

    private WebElement lblCountry() {
        return getWebdriver().findElement(By.id("field-country"));
    }

    private WebElement lblSalesRepEmployeeNumber() {
        return getWebdriver().findElement(By.id("field-salesRepEmployeeNumber"));
    }

    private WebElement lblCreditLimit() {
        return getWebdriver().findElement(By.id("field-creditLimit"));
    }

    private WebElement btnSave() {
        return getWebdriver().findElement(By.id("form-button-save"));
    }

    private WebElement btnGoBack() {
        return getWebdriver().findElement(By.xpath("//*[@id=\"report-success\"]/p/a[2]"));
    }

    private WebElement lblReport() {

        return getWebdriver().findElement(By.xpath("//div[@id=\"report-success\"]/p"));
    }

    public CustomerPage createNewCustumer() {
        wait.until(ExpectedConditions.visibilityOf(lblCustomerName())).sendKeys("Teste Sicredi");
        wait.until(ExpectedConditions.visibilityOf(lblFirstName())).sendKeys("Fabricio");
        wait.until(ExpectedConditions.visibilityOf(lblLastName())).sendKeys("Teste");
        wait.until(ExpectedConditions.visibilityOf(lblPhone())).sendKeys("51 9999-9999");
        wait.until(ExpectedConditions.visibilityOf(lblAdress1())).sendKeys("Av Assis Brasil, 3970");
        wait.until(ExpectedConditions.visibilityOf(lblAdress2())).sendKeys("Torre D");
        wait.until(ExpectedConditions.visibilityOf(lblCity())).sendKeys("Porto Alegre");
        wait.until(ExpectedConditions.visibilityOf(lblState())).sendKeys("RS");
        wait.until(ExpectedConditions.visibilityOf(lblPostalCode())).sendKeys("91000-000");
        wait.until(ExpectedConditions.visibilityOf(lblCountry())).sendKeys("Brasil");
        wait.until(ExpectedConditions.visibilityOf(lblSalesRepEmployeeNumber())).sendKeys("Fixter");
        wait.until(ExpectedConditions.visibilityOf(lblCreditLimit())).sendKeys("200");
        wait.until(ExpectedConditions.visibilityOf(btnSave())).click();
        return this;
    }

    public String validateMessage() {
        return lblReport().getText().substring(0, 57);
    }

    public void goBackToList() {

        wait.until(ExpectedConditions.visibilityOf(btnGoBack())).click();

    }
}




