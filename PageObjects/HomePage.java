package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    static String  cmbBootStrap = "switch-version-select";
    static String btnCustomer = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a";


    public void changeBootStrapTypeToV4(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(cmbBootStrap))).isEnabled();
        Select select = new Select(driver.findElement(By.id(cmbBootStrap)));
        select.selectByIndex(3);
    }

    public void openCustomerForm(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnCustomer))).click();
    }

}
