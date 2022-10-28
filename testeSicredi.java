import PageObjects.CustomerPage;
import PageObjects.HomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeSicredi {
    static WebDriver driver;
    private static HomePage hp;
    private static CustomerPage cp;

    @BeforeAll
    public static void goTo(){
        driver = new ChromeDriver();
        driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        System.setProperty("webdriver.chorome.river", "C:/args/fabriciosantos/AppData/Local/Programs/Python/Python310/Scripts");
        hp = new HomePage(driver);
        cp = new CustomerPage(driver);
    }
    @Test
    public void Test1(){
        hp.changeBootStrapTypeToV4();
        hp.openCustomerForm();
        cp.createNewCustumer();
        cp.validateMessage();
        driver.close();
    }


}
