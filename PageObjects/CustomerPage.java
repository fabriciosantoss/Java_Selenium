package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerPage {
    final WebDriver driver;

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    String lblCustomerName = "field-customerName";
    String lblLastName = "field-contactLastName";
    String lblFirstName = "field-contactFirstName";
    String lblPhone="field-phone";
    String lblAdress1="field-addressLine1";
    String lblAdress2="field-addressLine2";
    String lblCity="field-city";
    String lblState="field-state";
    String lblPostalCode="field-postalCode";
    String lblCountry="field-country";
    String lblSalesRepEmployeeNumber="field-salesRepEmployeeNumber";
    String lblCreditLimit="field-creditLimit";
    String btnSave="form-button-save";
    String btnGoBack="//*[@id=\"report-success\"]/p/a[2]";
    String lblReport = "//div[@id=\"report-success\"]/p";


    public void createNewCustumer(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblCustomerName))).sendKeys("Teste Sicredi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblLastName))).sendKeys("Teste");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblFirstName))).sendKeys("Fabricio");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblPhone))).sendKeys("51 9999-9999");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblAdress1))).sendKeys("Av Assis Brasil, 3970");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblAdress2))).sendKeys("Torre D");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblCity))).sendKeys("Porto Alegre");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblState))).sendKeys("RS");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblPostalCode))).sendKeys("91000-000");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblCountry))).sendKeys("Brasil");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblSalesRepEmployeeNumber))).sendKeys("Fixter");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lblCreditLimit))).sendKeys("200");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(btnSave))).click();


    }

    public void validateMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String entireText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lblReport))).getText();
        String shorterText = entireText.substring(0,57);
        assertEquals("Your data has been successfully stored into the database.",shorterText);
    }

        public void goBackToList(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnGoBack))).click();

    }
}




