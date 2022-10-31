package src.test.java.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import src.test.java.core.DriverFactory;

import java.time.Duration;

import static src.test.java.core.DriverFactory.getWebdriver;


public class HomePage {

    private WebElement cmbBootStrap() {
        return getWebdriver().findElement(By.id("switch-version-select"));
    }
    private WebElement btnCustomer() {
        return getWebdriver().findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a"));
    }

    WebDriverWait wait = new WebDriverWait(getWebdriver(), Duration.ofSeconds(10));

    public HomePage changeBootStrapTypeToV4(){

        wait.until(ExpectedConditions.visibilityOf((cmbBootStrap()))).isEnabled();
        Select select = new Select(getWebdriver().findElement(By.id("switch-version-select")));
        select.selectByIndex(3);
        return this;
    }

    public HomePage openCustomerForm(){
        wait.until(ExpectedConditions.visibilityOf(btnCustomer())).click();
        return this;
    }

}
