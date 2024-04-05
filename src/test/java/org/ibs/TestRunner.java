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
        actions.saveProduct("Огурец");
        validationUtils.isNameAdded("Огурец");
        validationUtils.isTypeExist("Овощ");
        validationUtils.isCheckBoxExist("Огурец");
        validationUtils.isElementPresent("Огурец");

        actions.addProduct("Вишня");
        actions.selectType("Фрукт");
        actions.saveProduct("Вишня");
        validationUtils.isNameAdded("Вишня");
        validationUtils.isTypeExist("Фрукт");
        validationUtils.isCheckBoxExist("Вишня");
        validationUtils.isElementPresent("Вишня");

        actions.navigateToProductPage();
        actions.addProduct("Корнишон");
        actions.checkExotic();
        actions.saveProduct("Корнишон");
        validationUtils.isNameAdded("Корнишон");
        validationUtils.isTypeExist("Овощ");
        validationUtils.isCheckBoxExist("Корнишон");
        validationUtils.isElementPresent("Корнишон");

        actions.addProduct("Манго");
        actions.selectType("Фрукт");
        actions.checkExotic();
        actions.saveProduct("Манго");
        validationUtils.isNameAdded("Манго");
        validationUtils.isTypeExist("Фрукт");
        validationUtils.isCheckBoxExist("Манго");
        validationUtils.isElementPresent("Манго");

        actions.resetDatabase();

    }
}
