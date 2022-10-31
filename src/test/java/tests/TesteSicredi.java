package src.test.java.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import src.test.java.page.CustomerPage;
import src.test.java.page.HomePage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static src.test.java.core.DriverFactory.getWebdriver;
import static src.test.java.core.DriverFactory.killDriver;

public class TesteSicredi {
    private HomePage hp = new HomePage();
    private CustomerPage cp = new CustomerPage();


    @BeforeAll
    public static void initialize() {
        getWebdriver().get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
        System.setProperty("webdriver.chrome.driver", "C:/args/fabriciosantos/AppData/Local/Programs/Python/Python310/Scripts");
    }

    @AfterAll
    public static void tearDown() {
        killDriver();
    }

    @Test
    public void testCreateCustomer() {
        hp.changeBootStrapTypeToV4()
                .openCustomerForm();
        cp.createNewCustumer();
        assertEquals("Your data has been successfully stored into the database.", cp.validateMessage());
    }


}
