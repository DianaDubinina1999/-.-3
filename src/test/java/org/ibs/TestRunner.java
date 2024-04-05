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

        actions.CreateNewProduct();
        actions.addName("Огурец");
        validationUtils.isNameAdded("Огурец");
        actions.saveProduct();
        validationUtils.isProductExist("Огурец");


        actions.CreateNewProduct();
        actions.addName("Вишня");
        validationUtils.isNameAdded("Вишня");
        actions.selectType("Фрукт");
        validationUtils.isTypeExist("Фрукт");
        actions.saveProduct();
        validationUtils.isProductExist("Вишня");


        actions.CreateNewProduct();
        actions.addName("Корнишон");
        validationUtils.isNameAdded("Корнишон");
        actions.checkExotic();
        validationUtils.isCheckBoxExist("Корнишон");
        actions.saveProduct();
        validationUtils.isProductExist("Корнишон");


        actions.CreateNewProduct();
        actions.addName("Манго");
        validationUtils.isNameAdded("Манго");
        actions.selectType("Фрукт");
        validationUtils.isTypeExist("Фрукт");
        actions.checkExotic();
        validationUtils.isCheckBoxExist("Манго");
        actions.saveProduct();
        validationUtils.isProductExist("Манго");


        actions.resetDatabase();

    }
}
