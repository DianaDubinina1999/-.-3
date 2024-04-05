package org.ibs;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRunner {
    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080");

        ProductPageActions actions = new ProductPageActions(driver);
        ValidationUtils validationUtils = new ValidationUtils(driver);

        actions.navigateToProductPage();
        actions.addProduct("Огурец");
        validationUtils.isNameAdded();
        actions.saveProduct("Огурец");
        validationUtils.isProductExist("Огурец");

        actions.addProduct("Вишня");
        validationUtils.isNameAdded();
        actions.selectType("Фрукт");
        validationUtils.isTypeExist("Фрукт");
        actions.saveProduct("Вишня");
        validationUtils.isProductExist("Вишня");

        actions.navigateToProductPage();
        actions.addProduct("Корнишон");
        validationUtils.isNameAdded();
        actions.checkExotic();
        validationUtils.isCheckBoxExist("Корнишон");
        actions.saveProduct("Корнишон");
        validationUtils.isProductExist("Корнишон");

        actions.addProduct("Манго");
        validationUtils.isNameAdded();
        actions.selectType("Фрукт");
        validationUtils.isTypeExist("Фрукт");
        actions.checkExotic();
        validationUtils.isCheckBoxExist("Манго");
        actions.saveProduct("Манго");
        validationUtils.isProductExist("Манго");

        actions.resetDatabase();

    }
}
