package org.ibs;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ProductPageActions {
    private WebDriver driver;

    public ProductPageActions(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProductPage() {
        driver.findElement(By.id("navbarDropdown")).click();
        driver.findElement(By.linkText("Товары")).click();
    }

    public void addName(String name) {
        driver.findElement(By.cssSelector(".btn-grou > .btn")).click();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.findElement(By.id("name")).click();
        driver.findElement(By.id("name")).sendKeys(name);
    }

    public void saveProduct(String name) {
        driver.findElement(By.id("save")).click();
        driver.navigate().refresh();
    }

    public void selectType(String type) {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        WebElement dropdown = driver.findElement(By.id("type"));
        dropdown.findElement(By.xpath("//option[. = '" + type + "']")).click();
    }

    public void checkExotic() {
        driver.findElement(By.id("exotic")).click();
    }

    public void resetDatabase() {
        driver.findElement(By.id("navbarDropdown")).click();
        driver.findElement(By.id("reset")).click();
        driver.close();
    }
}
